/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.barbosaleo.dao.generic.jdbc.dao;

import com.barbosaleo.domain.Produto;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public interface IProdutoDAO {
    
    public Integer cadastrar(Produto produto)throws Exception;
    public Integer atualizar(Produto produto)throws Exception;
    public Produto buscar(String codigo)throws Exception;
    public List<Produto> buscarTodos()throws Exception;
    public Integer excluir(Produto produto)throws Exception;
}
