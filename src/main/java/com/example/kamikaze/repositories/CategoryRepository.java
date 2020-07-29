package com.example.kamikaze.repositories;


import com.example.kamikaze.entities.Category;
import com.example.kamikaze.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CategoryRepository extends JpaRepository<Category, Long> {


}
