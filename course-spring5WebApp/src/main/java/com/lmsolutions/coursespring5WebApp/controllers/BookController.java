package com.lmsolutions.coursespring5WebApp.controllers;

import com.lmsolutions.coursespring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jt on 5/18/17.
 */
@Controller
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model) {
        model.addAttribute("title","A list of book");
        model.addAttribute("content","partials/books");

        model.addAttribute("books", bookRepository.findAll());


        return "master";
    }
}
