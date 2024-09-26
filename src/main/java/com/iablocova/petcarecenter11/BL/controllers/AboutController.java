package com.iablocova.petcarecenter11.BL.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String getAbout(){return "about";}

    //test GitLab

    @GetMapping("/blog")
    public String getBlog(){return "blog";}

    @GetMapping("/blog-single")
    public String getBlogSingle(){return "blog-single";}

    @GetMapping("/contact")
    public String getContact(){return "contact";}

    @GetMapping("/error")
    public String getError(){return "error";}

    @GetMapping("/gallery")
    public String getGallery(){return "gallery";}

    @GetMapping("/index-2")
    public String getIndex2(){return "index-2";}

    @GetMapping("/service")
    public String getService(){return "service";}

    @GetMapping("/single-service-1")
    public String getService1(){return "single-service-1";}

    @GetMapping("/single-service-2")
    public String getService2(){return "single-service-2";}

    @GetMapping("/single-service-3")
    public String getService3(){return "single-service-3";}

    @GetMapping("/single-service-4")
    public String getService4(){return "single-service-4";}

    @GetMapping("/single-service-5")
    public String getService5(){return "single-service-5";}

    @GetMapping("/single-service-6")
    public String getService6(){return "single-service-6";}




}
