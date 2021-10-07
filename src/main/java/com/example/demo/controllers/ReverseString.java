package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseString {
    @GetMapping("reverse_string/{str}")
    public String reverseString(@PathVariable String str){
        StringBuilder reverseBuilder = new StringBuilder();

        reverseBuilder.append(str);
        reverseBuilder.reverse();

        return reverseBuilder.toString();
    }
}
