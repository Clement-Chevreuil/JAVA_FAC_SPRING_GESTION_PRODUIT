package com.example.application_entreprise_tp7.DAO;

import com.example.application_entreprise_tp7.entity.Produit;

import java.util.List;

public interface IProduit {

    public Produit save(Produit produit);
    public List<Produit> findAll();
    public Produit find(Long id);
    public Produit update(Produit produit);
    public List<Produit> findByDesignations(String mc);
    public void delete(Long id);


}
