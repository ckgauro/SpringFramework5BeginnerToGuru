package com.gauro.SpringFramework5Example.controller;

import com.gauro.SpringFramework5Example.repositories.AuthorRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Chandra
 */
@Slf4j
@AllArgsConstructor
@Controller
public class AuthorController {
    private final AuthorRepository authorRepository;

    @RequestMapping("authors")
    public String getAuthors(Model model){
        log.info("Authors is called======>");
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
