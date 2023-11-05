package com.example.demo.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "offici")
public class Officio {
    @Id
    @GeneratedValue
    private long id;
    private String nome;
    private String via;
    private String citta;

    @OneToOne(mappedBy = "officio")
    private Postazione postazione;

    public Officio() {
    }

    public Officio(String nome, String via, String citta) {
        this.nome = nome;
        this.via = via;
        this.citta = citta;
    }
}
