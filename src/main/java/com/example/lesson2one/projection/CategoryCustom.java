package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Category;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Category.class)
public interface CategoryCustom {

    Integer getId();
    String getName();
    boolean getActive();
    Category getParentCategory();

}
