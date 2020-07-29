package com.example.kamikaze.services;


import com.example.kamikaze.entities.Category;
import com.example.kamikaze.entities.User;
import com.example.kamikaze.repositories.CategoryRepository;
import com.example.kamikaze.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);

        return obj.get();
    }



}
