/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo;

import com.barbosaleo.dao.ProdutoDAOMock;
import com.barbosaleo.dao.IProdutoDAO;
import com.barbosaleo.dao.ProdutoDAOMock;
import com.barbosaleo.domain.Produto;
import com.barbosaleo.domain.Produto;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import com.barbosaleo.service.IProdutoService;
import com.barbosaleo.service.ProdutoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ProdutoServiceTest {
    
    private final IProdutoService produtoService;
    private final IProdutoDAO produtoDAO;
    private Produto produto;
    
    public ProdutoServiceTest(){
        produtoDAO = new ProdutoDAOMock();
        produtoService = new ProdutoService(produtoDAO);
    }
    
    @Before
    public void init(){
        produto = new Produto(10L);
    }
    
    @Test
    public void pesquisarProduto() {
        Produto produtoConsultado = produtoService.consultar(produto.getId());
        Assert.assertNotNull(produtoConsultado);
    }
    
    @Test
    public void salvarProduto() throws TipoChaveNaoEncontradaException{
        Boolean retorno = produtoService.cadastrar(produto);
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void excluirProduto(){
        Boolean retorno = produtoService.excluir(produto.getId());
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException{
        produto.setNome("Pablo");
        produtoService.alterar(produto);
        
        Assert.assertEquals("Pablo", produto.getNome());
    }
}
