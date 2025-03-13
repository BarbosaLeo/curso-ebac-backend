/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.service.generics;

import com.barbosaleo.domain.Persistente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;

/**
 *
 * @author Leonardo
 * @param <T>
 */
public interface IGenericService<T extends Persistente> {
    
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException;
    
    T consultar(Long valor);

    Boolean excluir(Long valor);

    Boolean alterar(T entity) throws TipoChaveNaoEncontradaException;

    Collection<T> buscarTodos();
    
}
