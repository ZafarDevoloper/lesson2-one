package com.example.lesson2one.repository;


import com.example.lesson2one.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "address",collectionResourceRel = "list",excerptProjection = Category.class)
public interface CategoryRepository extends JpaRepository<Category,Integer> {

}
