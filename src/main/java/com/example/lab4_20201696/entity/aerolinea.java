package com.example.lab4_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="aerolinea")
public class aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idaerolinea")
    private int id;
    @Column(nullable = false)
    private String nombre;
    private String codigo;
}
