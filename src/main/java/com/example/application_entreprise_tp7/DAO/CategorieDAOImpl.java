package com.example.application_entreprise_tp7.DAO;

import com.example.application_entreprise_tp7.entity.Categorie;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;
import com.example.application_entreprise_tp7.entity.Categorie;
import com.example.application_entreprise_tp7.DAO.ICategorieDAO;

@Repository
@Transactional
public class CategorieDAOImpl implements ICategorieDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Categorie save(Categorie categorie) {
        em.persist(categorie);
        return categorie;
    }

    @Override
    public List<Categorie> findAll() {
        Query q = em.createQuery("Select c from Categorie c ");
        return q.getResultList();
    }

    @Override
    public Categorie update(Categorie categorie) {
        em.merge(categorie);
        return categorie;
    }

    @Override
    public void delete(Long id) {
        Categorie todelete =em.find(Categorie.class, id);
        em.remove(todelete);
    }
}
