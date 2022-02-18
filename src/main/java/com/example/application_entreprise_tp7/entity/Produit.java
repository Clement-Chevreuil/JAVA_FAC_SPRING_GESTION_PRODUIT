package com.example.application_entreprise_tp7.entity;

import javax.persistence.*;
import java.io.Serializable;
import com.example.application_entreprise_tp7.entity.Categorie;
@Entity
public class Produit implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "designation", nullable = false)
    private String designation;
    @Column(name = "prix", nullable = false)
    private double prix;
    @Column(name = "quantite", nullable = false)
    private int quantite;
    @ManyToOne (cascade=CascadeType.PERSIST)
    @JoinColumn(name="ID_CAT")
    private Categorie categorie;

    public Produit(Long id, String designation, double prix, int quantite)
    {
        this.id = id;
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
    public Produit(String designation, double prix, int quantite)
    {
        this.designation = designation;
        this.prix = prix;
        this.quantite = quantite;
    }
    public Produit() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public double getPrix() {
        return prix;
    }

    public int getQuantite() {
        return quantite;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
