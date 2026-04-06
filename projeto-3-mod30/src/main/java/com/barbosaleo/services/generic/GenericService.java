/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.services.generic;

import com.barbosaleo.dao.Persistente;
import com.barbosaleo.dao.generic.IGenericDAO;
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
public abstract class GenericService<T extends Persistente, E extends Serializable> implements IGenericService<T,E> {

    protected IGenericDAO<T, E> dao;

    public GenericService(IGenericDAO<T, E> dao) {
        this.dao = dao;
    }

    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        return this.dao.cadastrar(entity);
    }

    @Override
    public void excluir(E valor) throws DAOException {
        this.dao.excluir(valor);
    }

    @Override
    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
        this.dao.alterar(entity);
    }

    @Override
    public T consultar(E valor) throws DAOException {
        try {
            return this.dao.consultar(valor);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            //TODO levantar um erro genérico
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Collection<T> consultarTodos() throws DAOException {
        return this.dao.buscarTodos();
    }

}
