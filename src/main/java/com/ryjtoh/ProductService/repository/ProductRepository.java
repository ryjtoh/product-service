package com.ryjtoh.ProductService.repository;

import com.ryjtoh.ProductService.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public class ProductRepository extends MongoRepository<Product, String> {
}
