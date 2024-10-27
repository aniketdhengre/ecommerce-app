package com.example.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/products")
    public String getProducts() {
        return "[{\"id\":1, \"name\":\"Product 1\"}, {\"id\":2, \"name\":\"Product 2\"}]";
    }
}
