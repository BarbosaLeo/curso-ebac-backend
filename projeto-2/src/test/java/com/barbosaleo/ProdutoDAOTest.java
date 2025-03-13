/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo;

import com.barbosaleo.dao.ProdutoDAOMock;
import com.barbosaleo.dao.IProdutoDAO;
import com.barbosaleo.domain.Produto;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ProdutoDAOTest {
    
    private final IProdutoDAO produtoDAO;
    
    private Produto produto;
    
    public ProdutoDAOTest(){
        produtoDAO = new ProdutoDAOMock();
    }
    
    @Before
    public void init(){
        produto = new Produto(12L);
    }
    
    @Test
    public void consultarProduto(){
        Produto produtoConsultado = produtoDAO.consultar(produto.getId());
        Assert.assertNotNull(produtoConsultado);
    }
    
    @Test
    public void cadastrarProduto() throws TipoChaveNaoEncontradaException{
        Boolean retorno = produtoDAO.cadastrar(produto);
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void excluirProduto(){
        Boolean retorno = produtoDAO.excluir(produto.getId());
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException{
        Boolean retorno = produtoDAO.alterar(produto);
        Assert.assertTrue(retorno);
    }
}
