package com.example.SecondShop.controller;


import com.example.SecondShop.entity.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/value")
public class ValueController {

    @GetMapping
    public ResponseEntity getValue(RestTemplate restTemplate) {
        Value value = restTemplate.getForObject(
                "http://localhost:8443/api/quote", Value.class);


        return ResponseEntity.ok(value);
    }
}
