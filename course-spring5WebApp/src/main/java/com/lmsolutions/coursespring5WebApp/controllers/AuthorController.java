package com.lmsolutions.coursespring5WebApp.controllers;

import com.lmsolutions.coursespring5WebApp.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("title","A list of authors");
        model.addAttribute("content","partials/authors");
        model.addAttribute("authors", authorRepository.findAll());

        return "master";
    }
}
