package com.example.lesson2one.repository;


import com.example.lesson2one.entity.Input;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestResource(path = "input",excerptProjection = Input.class)
public interface InputRepository extends JpaRepository<Input,Integer> {

}
