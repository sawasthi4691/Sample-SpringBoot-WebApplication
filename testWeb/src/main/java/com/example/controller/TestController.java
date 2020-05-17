package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String viewHome() {
        return "index";
    }

    @GetMapping("/home")
    public String viewHome1() {
        return "hello";
    }
}
