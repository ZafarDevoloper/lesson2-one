package com.example.lesson2one.repository;


import com.example.lesson2one.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "warehouse",excerptProjection = Warehouse.class)
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer> {
    boolean findByName(String name);
}
