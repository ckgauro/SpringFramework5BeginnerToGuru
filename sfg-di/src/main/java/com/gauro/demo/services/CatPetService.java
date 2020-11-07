package com.gauro.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Chandra
 */

@Profile("cat")
@Service
public class CatPetService  implements PetService{
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
