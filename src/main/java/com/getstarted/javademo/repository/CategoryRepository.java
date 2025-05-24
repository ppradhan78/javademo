package com.getstarted.javademo.repository;
import com.getstarted.javademo.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<CategoryEntity, Integer> {

//Custom method can add
}