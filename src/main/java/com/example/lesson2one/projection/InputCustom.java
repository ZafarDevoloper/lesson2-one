package com.example.lesson2one.projection;

import com.example.lesson2one.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface InputCustom {
    Integer getId();
    String getName();
    Timestamp getTimestamp();

    Warehouse getWarehouse();

    Supplier getSupplier();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();

}
