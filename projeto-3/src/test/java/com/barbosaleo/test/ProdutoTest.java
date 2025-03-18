/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.generic.jdbc.dao.IProdutoDAO;
import com.barbosaleo.dao.generic.jdbc.dao.ProdutoDAO;
import com.barbosaleo.domain.Produto;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo
 */
public class ProdutoTest {
    
    public IProdutoDAO dao;
    
    @Before
    public void init(){
        dao = new ProdutoDAO();
    }
    
    @Test
    public void cadastrarProdutoTest() throws Exception{
        String cod = "1";
        Produto produto = new Produto("Teste", cod, 20.0d);
        Integer retorno = dao.cadastrar(produto);
        assertTrue(retorno == 1);
        
        Produto pDB = dao.buscar(cod);
        assertNotNull(pDB);
        assertEquals(pDB.getCodigo(),produto.getCodigo());
        assertEquals(pDB.getNome(),produto.getNome());
        assertEquals(pDB.getValor(),produto.getValor());
        
        Integer qtdDel = dao.excluir(pDB);
        assertNotNull(qtdDel);
    }
    
    @Test
    public void buscarTest() throws Exception{
        String cod = "1";
        Produto produto = new Produto("Teste", cod, 20.0d);
        Integer retorno = dao.cadastrar(produto);
        assertTrue(retorno == 1);
        
        Produto pDB = dao.buscar(cod);
        assertNotNull(pDB);
        assertEquals(pDB.getCodigo(),produto.getCodigo());
        assertEquals(pDB.getNome(),produto.getNome());
        assertEquals(pDB.getValor(),produto.getValor());
        
        Integer qtdDel = dao.excluir(pDB);
        assertNotNull(qtdDel);
    }
    
    @Test
    public void buscarTodosTest() throws Exception{
        int qtdCadastro = 5;
        
        List<Produto> pListCadastro = new ArrayList<>();
        while(qtdCadastro != 0){
            Produto produto = new Produto(
                    "Teste "+ qtdCadastro, 
                    String.valueOf(qtdCadastro), 
                    Double.valueOf(qtdCadastro)
            );
            Integer retorno = dao.cadastrar(produto);
            assertTrue(retorno == 1);
            pListCadastro.add(produto);
            
            qtdCadastro--;
        }
        
        List<Produto> pListBanco = dao.buscarTodos();
        assertNotNull(pListBanco);
        assertEquals(pListCadastro.size(), pListBanco.size());
        
        int qtdDel = dao.buscarTodos().size();
        for(Produto produto : pListBanco){
            qtdDel -= dao.excluir(produto);
        }
        assertEquals(qtdDel, dao.buscarTodos().size());
    }
    
    @Test
    public void atualizarTest() throws Exception{
        String cod = "10";
        String codNovo = "12";
        
        Produto produto = new Produto("Teste", cod, 20.0d);
        Integer countCadastro = dao.cadastrar(produto);
        assertTrue(countCadastro == 1);
    
        Produto pDB = dao.buscar(cod);
        assertNotNull(pDB);
        assertEquals(produto.getNome(), pDB.getNome());
        assertEquals(produto.getCodigo(), pDB.getCodigo());
        
        pDB.setCodigo(codNovo);
        pDB.setNome("Teste 2");
        Integer countAtualizar = dao.atualizar(pDB);
        assertNotNull(countAtualizar);
        
        Produto produtoAntigo = dao.buscar(cod);
        assertNull(produtoAntigo);
        
        Produto pDB2 = dao.buscar(codNovo);
        assertNotNull(pDB2);
        assertEquals(pDB.getNome(), pDB2.getNome());
        assertEquals(pDB.getCodigo(), pDB2.getCodigo());
        
        List<Produto> list = dao.buscarTodos();
        for(Produto c : list){
            dao.excluir(c);
        }
    }
}
