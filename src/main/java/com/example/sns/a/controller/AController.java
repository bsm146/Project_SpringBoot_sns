package com.example.sns.a.controller;

import com.example.sns.a.service.AService;
import com.example.sns.directory.Directory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AController {

    public static final String HOME = Directory.HOME;

    @Autowired
    private AService aService;

//    @GetMapping("/a")
//    public String base(Model model) {
//
//        aService.base();
//        model.addAttribute("view", HOME + "home");
//
//        return "view";
//    }
}
