package com.miristan.tarini.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TariniController
{
    @GetMapping("/login")
    public String loginHandler()
    {
        return "login";
    }

}
