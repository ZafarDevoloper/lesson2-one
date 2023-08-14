package com.example.lesson2one.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String firstname;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false,unique = true)
    private String phoneNumber;
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String code;
    @Column(nullable = false)
    private String password;
    private boolean active=true;
    @ManyToMany
    private Set<Warehouse> warehouse;//uniqe likni talab qiladi har doyim set buladi
}
