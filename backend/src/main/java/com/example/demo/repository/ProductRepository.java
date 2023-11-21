package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.domain.Product;
import com.example.demo.dto.ProductDto;

public interface ProductRepository extends MongoRepository<Product, String> {
    public void deleteById(int productNumber);
    public Product findBy(int productNumber);



}
