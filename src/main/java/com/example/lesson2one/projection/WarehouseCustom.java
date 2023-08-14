package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Category;
import com.example.lesson2one.entity.Warehouse;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Warehouse.class)
public interface WarehouseCustom {

    Integer getId();
    String getName();
    boolean getActive();

}
