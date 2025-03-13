/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.service.generics;

import com.barbosaleo.dao.generics.IGenericDAO;
import com.barbosaleo.domain.Persistente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;


/**
 *
 * @author Leonardo
 */
public class GenericService<T extends Persistente> implements IGenericService<T>{

    private final IGenericDAO genericDAO;
    
    public GenericService(IGenericDAO<T> genericDAO){
        this.genericDAO = genericDAO;
    }
    
    
    @Override
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException {
        return genericDAO.cadastrar(entity);
    }

    @Override
    public T consultar(Long valor) {
        return (T) genericDAO.consultar(valor);
    }

    @Override
    public Boolean excluir(Long valor) {
        return genericDAO.excluir(valor);
    }

    @Override
    public Boolean alterar(T entity) throws TipoChaveNaoEncontradaException {
        return genericDAO.alterar(entity);
    }

    @Override
    public Collection buscarTodos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
