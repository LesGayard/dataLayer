package com.Jpa.dataLayer.service;

import com.Jpa.dataLayer.model.Category;
import com.Jpa.dataLayer.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Iterable<Category> getCategories(){
        return this.categoryRepository.findAll();
    }
}
