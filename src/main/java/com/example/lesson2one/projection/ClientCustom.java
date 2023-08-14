package com.example.lesson2one.projection;

import com.example.lesson2one.entity.AttachmentContent;
import com.example.lesson2one.entity.Client;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Client.class)
public interface ClientCustom {
    String getPhoneNumber();
    Integer getId();
    String getName();
    boolean getActive();

}
