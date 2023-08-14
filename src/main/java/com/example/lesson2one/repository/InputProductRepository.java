package com.example.lesson2one.repository;


import com.example.lesson2one.entity.InputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "inputProduct",excerptProjection = InputProduct.class)
public interface InputProductRepository extends JpaRepository<InputProduct,Integer> {

}
