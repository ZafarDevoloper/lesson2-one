package com.example.lesson2one.entity;


import com.example.lesson2one.entity.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
//o'lchov birligi
public class Measurement extends AbsEntity {

}
