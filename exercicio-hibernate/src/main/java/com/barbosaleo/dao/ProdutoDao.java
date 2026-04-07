/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.domain.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Leonardo
 */
public class ProdutoDao implements IProdutoDao {

    @Override
    public Produto cadastrar(Produto p) {
        EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("com.barbosaleo.projeto_hibernate.teste");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persist(p);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
        
        return p;
    }
    
}
