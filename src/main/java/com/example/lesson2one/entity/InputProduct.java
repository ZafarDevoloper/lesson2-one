package com.example.lesson2one.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class InputProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Product product;
    @Column(nullable = false)
    private Double amount;//
    private Double price;
    private Date expireDate;//qachon kelgani
    @ManyToOne//ko'plab maxsulotlar bitta moshinada bulishi mumkin
    private Input input;//moshina

}
