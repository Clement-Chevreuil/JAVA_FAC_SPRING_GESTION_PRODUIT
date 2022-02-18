package com.example.application_entreprise_tp7;

import com.example.application_entreprise_tp7.DAO.IProduit;
import com.example.application_entreprise_tp7.entity.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class ApplicationEntrepriseTp7Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ApplicationEntrepriseTp7Application.class, args);

        IProduit produitDAO = ctx.getBean(IProduit.class);
        produitDAO.save(new Produit("EcranC", 250, 4));
        produitDAO.save(new Produit("EcranRCD", 250, 4));

        List<Produit> listProduit = produitDAO.findAll();
        for(Produit produit : listProduit)
        {
            System.out.println(produit.getDesignation());
        }
    }

}
