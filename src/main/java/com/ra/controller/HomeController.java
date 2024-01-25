package com.ra.controller;

import com.ra.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping
    public ResponseEntity<?> home(){
        return new ResponseEntity<>("Home", HttpStatus.OK);
    }
    @GetMapping("/Categories")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity<>(categoryService.getAll(), HttpStatus.OK);
    }
}
