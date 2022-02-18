package com.example.application_entreprise_tp7.DAO;

import com.example.application_entreprise_tp7.entity.Produit;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProduitDAOImpl implements IProduit{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Produit save(Produit produit)
    {
        em.persist(produit);
        return produit;
    }

    @Override
    public List<Produit> findAll() {
        return null;
    }

    @Override
    public Produit find(Long id) {
        return null;
    }

    @Override
    public Produit update(Produit produit) {
        return null;
    }

    @Override
    public List<Produit> findByDesignations(String mc) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
