package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Input;
import com.example.lesson2one.entity.Output;
import com.example.lesson2one.entity.OutputProduct;
import com.example.lesson2one.entity.Product;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(types = OutputProduct.class)
public interface OutputProductCustom {
    Integer getId();
    Product getProduct();
    Double getAmount();
    Double getPrice();

    Output getOutput();
}
