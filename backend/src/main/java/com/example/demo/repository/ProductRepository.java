package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.domain.Product;
import com.example.demo.dto.ProductDto;

public interface ProductRepository extends MongoRepository<Product, String> {
    public void deleteByNumber(Integer productNumber);
    public Product findBy(Integer productNumber);



}
