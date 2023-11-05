package com.example.demo.entites;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue
    private long Id;
    private String name;
    private String cognome;
    private String email;
    @OneToMany(mappedBy = "user")
    private List<Prenotazione> listaPrenotazioni;
}
