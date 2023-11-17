package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.domain.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
