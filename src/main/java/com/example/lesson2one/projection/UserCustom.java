package com.example.lesson2one.projection;

import com.example.lesson2one.entity.User;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = User.class)
public interface UserCustom {
    Integer getId();

    String getFirstname();
    String getLastname();
    String getPhoneNumber();
    String getCode();
    String getPassword();
    boolean getActive();
}
