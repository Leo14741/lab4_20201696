package com.example.lab4_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="reserva")
public class reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idreserva;
    @Column(nullable = false)
    private String fecha_reserva;
    private String precio_total;
    private String estado_pago;
}