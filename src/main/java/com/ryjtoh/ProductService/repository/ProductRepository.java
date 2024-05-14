package com.ryjtoh.ProductService.repository;

import com.ryjtoh.ProductService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
