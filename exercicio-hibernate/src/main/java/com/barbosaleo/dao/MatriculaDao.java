/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.domain.Matricula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author Leonardo
 */
public class MatriculaDao implements IMatriculaDao{
    
    @Override
    public Matricula cadastrar(Matricula mat){
        
        EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("com.barbosaleo.projeto_hibernate.teste");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persist(mat);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
        
        return mat;
    }

}
