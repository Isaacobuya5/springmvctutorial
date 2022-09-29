/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springmvc.conference.controller;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Zakol
 */
@Controller
public class GreetingController {
    
    @GetMapping("/greeting") 
    // tells spring which mapping is going to handle which request
    public String greeting(Map<String, Object> model) {
        // passing model back to our template
        model.put("message", "Hello Isaac");
        return "greeting";
    }
    
    @GetMapping("/thyme") 
    // tells spring which mapping is going to handle which request
    public String thymePage(Map<String, Object> model) {
        // passing model back to our template
        model.put("message", "Hello Isaac");
        return "thyme";
    }
}
