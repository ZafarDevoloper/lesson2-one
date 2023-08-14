package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Currency;
import com.example.lesson2one.entity.Measurement;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Measurement.class)
public interface MeasurementCustom {

    Integer getId();
    String getName();
    boolean getActive();

}
