package com.lmsolutions.coursespring5WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller()
public class IndexCtrl {
    private String test;

    @RequestMapping()
    @GetMapping(path = "/", produces = "text/xml")
    public String index(Model model) {

        model.addAttribute("message", "test");
        model.addAttribute("content", "partials/test");
        return "index";
    }


}
