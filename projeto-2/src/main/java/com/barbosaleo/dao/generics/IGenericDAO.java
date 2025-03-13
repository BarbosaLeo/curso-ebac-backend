/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.generics;

import com.barbosaleo.domain.Persistente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;

/**
 *
 * @author Leonardo
 * @param <T>
 */
public interface IGenericDAO<T extends Persistente> {
    
    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
    public Boolean excluir(Long valor);
    public Boolean alterar(T entity) throws TipoChaveNaoEncontradaException;
    public T consultar(Long valor);
    public Collection<T> buscarTodos();
}
