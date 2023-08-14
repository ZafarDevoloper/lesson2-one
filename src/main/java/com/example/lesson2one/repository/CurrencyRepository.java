package com.example.lesson2one.repository;

import com.example.lesson2one.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "currency",excerptProjection = Currency.class)
public interface CurrencyRepository extends JpaRepository<Currency,Integer> {
    boolean findByName(String name);
}
