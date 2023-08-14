package com.example.lesson2one.projection;

import com.example.lesson2one.entity.*;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Product.class)
public interface SupplierCustom {

    Integer getId();

    String getName();

    boolean getActive();
    String getCode();
    Category getCategory();
    Attachment getAttachment();
    Measurement getMeasurement();

}
