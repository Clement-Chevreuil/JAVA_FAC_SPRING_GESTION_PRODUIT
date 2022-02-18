package com.example.application_entreprise_tp7.DAO;

import com.example.application_entreprise_tp7.entity.Categorie;

import java.util.List;

public interface ICategorieDAO {

    public Categorie save(Categorie categorie);
    public List<Categorie> findAll();
    public Categorie update(Categorie categorie);
    public void delete(Long id);


}
