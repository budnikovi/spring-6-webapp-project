package com.springframework.spring6webappproject.controllers;

import com.springframework.spring6webappproject.services.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }
    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorService.findall());

        return "authors";
    }
}
