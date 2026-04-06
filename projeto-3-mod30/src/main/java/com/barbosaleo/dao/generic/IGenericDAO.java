/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.barbosaleo.dao.generic;

import com.barbosaleo.dao.Persistente;
import com.barbosaleo.exceptions.DAOException;
import com.barbosaleo.exceptions.MaisDeUmRegistroException;
import com.barbosaleo.exceptions.TableException;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.io.Serializable;
import java.util.Collection;

/**
 *
 * @author Leonardo
 * @param <T> 
 * @param <E> 
 */
public interface IGenericDAO<T extends Persistente, E extends Serializable> {
    
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    
    public void excluir(E value) throws DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;
    
    public T consultar(E value) throws MaisDeUmRegistroException, TableException, DAOException;
    
    public Collection<T> buscarTodos() throws DAOException;
    
}
