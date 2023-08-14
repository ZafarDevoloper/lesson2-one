package com.example.lesson2one.entity;

import com.example.lesson2one.entity.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Warehouse extends AbsEntity {

}
