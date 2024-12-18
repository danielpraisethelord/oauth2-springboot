package com.oauth2.oauth_client.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, World!");
    }

    @GetMapping("/authorized")
    public ResponseEntity<String> authorized(@RequestParam String code) {
        return ResponseEntity.ok().body("Authorized: " + code);
    }
}