package com.oauth2.oauth2_resource_server.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resources")
public class ResourceController {

    @GetMapping("/user")
    public ResponseEntity<String> readUser(Authentication auth) {
        return ResponseEntity.ok("The user can read. " + auth.getAuthorities());
    }

    @PostMapping("/user")
    public ResponseEntity<String> writeUser(Authentication auth) {
        return ResponseEntity.ok("The user can write. " + auth.getAuthorities());
    }

}