package com.iablocova.petcarecenter11.BL.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class TestController {
    @GetMapping("/test")
    public String getAbout(){return "test";}
}
