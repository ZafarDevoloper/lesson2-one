package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Input;
import com.example.lesson2one.entity.InputProduct;
import com.example.lesson2one.entity.Product;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = InputProduct.class)
public interface InputProductCustom {

     Integer getId();
     Product getProduct();
     Double getAmount();
     Double getPrice();
     Date getExpireDate();
    Input getInput();
}
