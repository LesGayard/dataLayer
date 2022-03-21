package com.Jpa.dataLayer.service;

import com.Jpa.dataLayer.model.Product;
import com.Jpa.dataLayer.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public Iterable<Product> getProducts(){
        return this.productRepository.findAll();
    }
}
