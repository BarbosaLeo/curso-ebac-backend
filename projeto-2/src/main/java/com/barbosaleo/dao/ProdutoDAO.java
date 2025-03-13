/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.dao.generics.GenericDAO;
import com.barbosaleo.domain.Produto;

/**
 *
 * @author Leonardo
 */
public class ProdutoDAO extends GenericDAO<Produto> implements IProdutoDAO{

    public ProdutoDAO(){
        super();
    }
    
    @Override
    public Class<Produto> getTipoClasse() {
        return Produto.class;
    }

    @Override
    public void atualizarDados(Produto entry, Produto entityCadastrado) {
        entityCadastrado.setNome(entry.getNome());
        entityCadastrado.setMarca(entry.getMarca());
        entityCadastrado.setPreco(entry.getPreco());
    }
    
}
