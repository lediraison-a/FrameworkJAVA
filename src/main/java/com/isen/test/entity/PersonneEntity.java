package com.isen.test.entity;

import com.isen.test.dto.PersonneDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personne")
public class PersonneEntity {

    @Id
    @Column(name = "identifiant")
    String id;
    @Column(name = "nom")
    String nom;
    @Column(name = "prenom")
    String prenom;

    public PersonneEntity() {
        super();
    }

    public PersonneEntity(PersonneDTO dto) {
        this.id = dto.getId();
        this.nom = dto.getNom();
        this.prenom = dto.getPrenom();
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public PersonneEntity(String id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
}
