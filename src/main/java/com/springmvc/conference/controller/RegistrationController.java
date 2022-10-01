/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springmvc.conference.controller;

import com.springmvc.conference.model.Registration;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
/**
 *
 * @author Zakol
 */
@Controller
public class RegistrationController {
    
    /*
    With the help of @ModelAttribute, we now have our object bound by our model to this ModelAttribute 
    */
    @GetMapping("/registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {
        
        return "registration";
    }
    
    @PostMapping("/registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration, BindingResult result) {
        System.out.println("Registration " + registration.getName());
        // check if error exists
        if (result.hasErrors()) {
            System.out.println("There were errors");
            return "registration";
        }
        return "redirect:registration";
    }
}
