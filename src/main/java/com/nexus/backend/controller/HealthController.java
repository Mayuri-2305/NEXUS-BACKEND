package com.nexus.backend.controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin (origins = "http://localhost:5174")
@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String health() {
        return "NEXUS Backend is running successfully!";
    }
}
