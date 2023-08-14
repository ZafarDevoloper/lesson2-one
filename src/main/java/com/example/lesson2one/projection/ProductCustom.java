package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Client;
import com.example.lesson2one.entity.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface ProductCustom {
    String getPhoneNumber();
    Integer getId();
    String getName();
    boolean getActive();

}
