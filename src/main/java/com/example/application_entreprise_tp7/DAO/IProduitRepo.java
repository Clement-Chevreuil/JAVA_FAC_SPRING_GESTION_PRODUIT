package com.example.application_entreprise_tp7.DAO;

import com.example.application_entreprise_tp7.entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IProduitRepo extends JpaRepository<Produit, Long> {

    @Query("select p from Produit p join p.categorie c where c.nomCategorie = :x")
    public List<Produit> findByCategory (@Param("x")String nc);
}
