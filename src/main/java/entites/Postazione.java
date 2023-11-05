package entites;

import enums.PostazioneType;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "prenotazioni")
public class Postazione {
@Id
    @GeneratedValue
    private long id;
private String descrizione;
private PostazioneType tipo;
private int maxNumeroPersone;

@OneToOne
    @JoinColumn(name = "building_id")
    private Officio officio;

@OneToMany(mappedBy = "postazione")
    List<Prenotazione> listaPrenotazioni;

private boolean eLibera;

public Postazione() {

}

    public Postazione(String descrizione, PostazioneType tipo, int maxNumeroPersone, Officio officio) {
        this.descrizione = descrizione;
        this.tipo = tipo;
        this.maxNumeroPersone = maxNumeroPersone;
        this.officio = officio;
        this.eLibera = true;
    }
}
