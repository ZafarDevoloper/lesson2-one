package com.example.lesson2one.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Input {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Timestamp timestamp;//bu maydon avtomatiski tuldiriladi
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Supplier supplier;//taminotchi
    @ManyToOne//kuplab kirimga bitta valyuta
    private Currency currency;
    private String factureNumber;
    @Column(nullable = false,unique = true)
    private String code;

}
