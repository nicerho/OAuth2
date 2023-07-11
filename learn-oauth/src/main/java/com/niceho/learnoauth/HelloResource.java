package com.niceho.learnoauth;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
    @GetMapping("/")
    public String hello(Authentication authentication) {
        System.out.println(authentication);
        return "Hello ~";
    }
}
