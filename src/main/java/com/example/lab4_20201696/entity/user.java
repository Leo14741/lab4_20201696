package com.example.lab4_20201696.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user")
public class user{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iduser")
    private int iduser;
    @Column(nullable = false)
    private String username;
    private String email;
    private String password;
}
