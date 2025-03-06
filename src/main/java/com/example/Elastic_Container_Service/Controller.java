package com.example.Elastic_Container_Service;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("appName", "My First Elastic Beanstalk Deploy");
        model.addAttribute("heroTitle", "This app is deployed by elastic beanstalk");
        model.addAttribute("heroDescription", "AWS Lab Week 3 Work");
        model.addAttribute("isAuthenticated", false); // Set based on authentication status
        model.addAttribute("companyName", "Amalitec");
        return "index";
    }
}
