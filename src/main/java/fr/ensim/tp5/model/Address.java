package fr.ensim.tp5.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Address {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private Long id;

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    public String getContent() {
        return content;
    }

    public String getAuteur() { return auteur; }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuteur(String auteur) { this.auteur = auteur; }

    private String auteur;
    private Date creation;
    private String content;
}
