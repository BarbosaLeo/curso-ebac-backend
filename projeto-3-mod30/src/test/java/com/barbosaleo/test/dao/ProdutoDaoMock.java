/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test.dao;

import com.barbosaleo.dao.IProdutoDAO;
import com.barbosaleo.domain.Produto;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;

/**
 *
 * @author Leonardo
 */
public class ProdutoDaoMock implements IProdutoDAO {

    @Override
    public Boolean cadastrar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public void excluir(String valor) {
        // TODO Auto-generated method stub

    }

    @Override
    public void alterar(Produto entity) throws TipoChaveNaoEncontradaException {
        // TODO Auto-generated method stub

    }

    @Override
    public Produto consultar(String valor) {
        Produto produto = new Produto();
        produto.setCodigo(valor);
        return produto;
    }

    @Override
    public Collection<Produto> buscarTodos() {
        // TODO Auto-generated method stub
        return null;
    }

}
