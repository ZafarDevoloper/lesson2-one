package com.example.lesson2one.repository;

import com.example.lesson2one.entity.Input;
import com.example.lesson2one.entity.Output;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "output",excerptProjection = Output.class)

public interface OutputRepository extends JpaRepository<Output,Integer> {

}
