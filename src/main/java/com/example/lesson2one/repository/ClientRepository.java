package com.example.lesson2one.repository;


import com.example.lesson2one.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "client",excerptProjection = Client.class)
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
