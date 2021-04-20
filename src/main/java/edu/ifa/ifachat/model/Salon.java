package edu.ifa.ifachat.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Salon {

    @Id
    private int id;
    private String nom;

    @OneToMany(mappedBy = "salon")
    private List<Message> listeMessage;

    public List<Message> getListeMessage() {
        return listeMessage;
    }

    public void setListeMessage(List<Message> listeMessage) {
        this.listeMessage = listeMessage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
