package com.example.lesson2one.repository;

import com.example.lesson2one.entity.Input;
import com.example.lesson2one.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product",excerptProjection = Product.class)

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
