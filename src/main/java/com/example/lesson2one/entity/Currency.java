package com.example.lesson2one.entity;

import com.example.lesson2one.entity.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;
@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Currency extends AbsEntity {

}
