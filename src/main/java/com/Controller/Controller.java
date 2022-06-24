package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String welcome() {
        return "Hello to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String admin() {
        return "Avengers.....Assemble";
    }

    @GetMapping("/secret-bases")
    public String user() {
        return "City List: <br> Amsterdam <br> Barcelona <br> Berlin <br> Brussels <br> Bucharest <br> London <br> Madrid  <br> Paris";
    }
}