package com.example.lesson2one.projection;

import com.example.lesson2one.entity.*;
import org.springframework.data.rest.core.config.Projection;

import java.sql.Timestamp;

@Projection(types = Output.class)
public interface OutputCustom {
    Integer getId();
    String getName();
    Timestamp getTimestamp();

    Warehouse getWarehouse();

    Client getClient();
    Currency getCurrency();
    String getFactureNumber();
    String getCode();

}
