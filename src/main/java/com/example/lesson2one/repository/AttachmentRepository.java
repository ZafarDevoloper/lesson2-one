package com.example.lesson2one.repository;

import com.example.lesson2one.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "attachment",excerptProjection = Attachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
