package com.ihandilnath.coursemanagementsystem.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    // TODO this class is only for testing purpose. Remove later.

    @GetMapping(path = "/")
    public String index() {
        return "Hello World";
    }

}
