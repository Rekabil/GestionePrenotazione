package com.example.demo.entites;

import jakarta.persistence.*;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
@Id
    @GeneratedValue
    private long id;
@ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
@ManyToOne
    @JoinColumn(name = "postazione_id")
    private Postazione postazione;
}
