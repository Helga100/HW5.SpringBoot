package com.example.hw5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
    @RequestMapping("/work/{color}")
    public String work(Model page,
                       @RequestParam(required = false) Integer x,
                       @PathVariable String color) {

        page.addAttribute("degree", x);
        page.addAttribute("color", color);
        return "work.html";

    }
}
