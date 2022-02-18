package com.example.application_entreprise_tp7.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Categorie implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String nomCategorie;
    @OneToMany(mappedBy="categorie", fetch = FetchType.LAZY)
    private Collection<Produit> produits;

    public Categorie()
    {
        super();
    }

    public Categorie(String nomCategorie){ super(); this.nomCategorie = nomCategorie;}

    public Collection<Produit> getProduits() {
        return produits;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

    public void setProduits(Collection<Produit> produits) {
        this.produits = produits;
    }
}
