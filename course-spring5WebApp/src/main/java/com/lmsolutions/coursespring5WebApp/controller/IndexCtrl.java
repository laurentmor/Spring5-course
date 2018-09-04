package com.lmsolutions.coursespring5WebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class IndexCtrl {
   @GetMapping(path = "/",produces = "text/xml")
    public String index(Model model){
       model.addAttribute("message","test");
       model.addAttribute("content","partials/test");
       return "index";
   }
}
