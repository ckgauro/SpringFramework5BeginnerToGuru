package com.gauro.demo.controllers;

import com.gauro.demo.services.PetService;
import org.springframework.stereotype.Controller;

/**
 * @author Chandra
 */
@Controller
public class PetController {
    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }
    public String whichPetIsTheBest(){
        return petService.getPetType();
    }
}
