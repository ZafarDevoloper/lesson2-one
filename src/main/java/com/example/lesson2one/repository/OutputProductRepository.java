package com.example.lesson2one.repository;

import com.example.lesson2one.entity.Input;
import com.example.lesson2one.entity.OutputProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "outputProduct",excerptProjection = OutputProduct.class)

public interface OutputProductRepository extends JpaRepository<OutputProduct,Integer> {

}
