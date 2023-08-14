package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Category;
import com.example.lesson2one.entity.Currency;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Currency.class)
public interface CurrencyCustom {

    Integer getId();
    String getName();
    boolean getActive();

}
