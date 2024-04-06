package com.otters.computerstore.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "auth")
public class AuthAPI {
    @GetMapping
    public ResponseEntity<?> ping() {
        return ResponseEntity.ok("OKE");
    }
}
