package com.example.lab4_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="vuelo")
public class vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idvuelo")
    private int idvuelo;
    @Column(nullable = false)
    private String origen;
    private String destino;
    private String fecha_salida;
    private String fecha_llegada;
    private String duración;
    private float precio;
    private int asientos_disponibles;
    private String descripcion;
}