package com.example.demo.controllers;

import java.util.*;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDto;
import com.example.demo.services.ProductService;

@RequestMapping("api/v1/products")
@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("")
    public ResponseEntity<?> addProduct(@RequestBody ProductDto productDto) {
        ProductDto newProduct = productService.addProduct(productDto);
        Map<String, Object> response = new HashMap();
        response.put("success", true);
        response.put("message", "Product added successfully");
        response.put("status", Response.SC_OK);
        response.put("data", newProduct);

        return new ResponseEntity<Map>(response, HttpStatus.OK);

    }

}
