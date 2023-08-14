package com.example.lesson2one.projection;

import com.example.lesson2one.entity.Attachment;
import org.springframework.data.rest.core.config.Projection;

@Projection(types = Attachment.class)
public interface AttachmentCustom {
    Integer getId();
    String getOriginalName();
    long getSize();
    String getContentType();
}
