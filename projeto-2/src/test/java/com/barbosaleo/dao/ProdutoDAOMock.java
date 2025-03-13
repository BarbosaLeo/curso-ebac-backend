/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.domain.Produto;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;

/**
 *
 * @author Leonardo
 */
public class ProdutoDAOMock implements IProdutoDAO {

    public ProdutoDAOMock(){
        
    }
    
    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public Boolean excluir(Long valor) {
        return true;
    }

    @Override
    public Boolean alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public Produto consultar(Long valor) {
        Produto produto = new Produto(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        return null;
    }
    
}
