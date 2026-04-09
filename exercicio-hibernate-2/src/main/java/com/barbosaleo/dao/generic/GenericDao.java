
package com.barbosaleo.dao.generic;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.io.Serializable;

/**
 *
 * @author Leonardo
 */
public abstract class GenericDao<T, E extends Serializable> implements IGenericDao<T, E> {
    
    public GenericDao() {

    }
    
    @Override
    public T cadastrar(T entity) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("com.barbosaleo.projeto_hibernate.teste");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        entityManager.getTransaction().begin();
        entityManager.persist(entity);
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
        
        return entity;
    }
    
    @Override
    public void excluir(E value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void alterar(T entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
