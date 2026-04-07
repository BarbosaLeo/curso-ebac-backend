/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.IProdutoDao;
import com.barbosaleo.dao.ProdutoDao;
import com.barbosaleo.domain.Produto;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leonardo
 */
public class ProdutoTest {
    
    private IProdutoDao produtoDao;
    
    public ProdutoTest() {
        produtoDao = new ProdutoDao();
    }
    
    @Test
    public void cadastro() {
        Produto P = new Produto();
        P.setCodigo("a1");
        P.setValor(55d);
        P.setNome("NOME TESTE");
        P.setDescricao("DESC TESTE");
        P = produtoDao.cadastrar(P);
        
        assertNotNull(P);
        assertNotNull(P.getId());
    }
    
}
