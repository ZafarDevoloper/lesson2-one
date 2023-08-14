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
public class Output {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Timestamp timestamp;
    @ManyToOne
    private Warehouse warehouse;
    @ManyToOne
    private Client client;//oluvchi
    @ManyToOne//kuplab kirimga bitta valyuta
    private Currency currency;
    private String factureNumber;
    @Column(nullable = false,unique = true)
    private String code;

}
