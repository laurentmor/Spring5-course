package com.lmsolutions.coursespring5WebApp.controller;

import com.lmsolutions.coursespring5WebApp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookCtrl {
    private BookRepository bookRepository;
    public BookCtrl(BookRepository repository){
        bookRepository=repository;
    }

    @RequestMapping(path = "/books")
    public String getBooks(Model model){
        model.addAttribute("books",bookRepository.findAll());
        model.addAttribute("content","partials/bookList.html");
    return "index";
    }
}
