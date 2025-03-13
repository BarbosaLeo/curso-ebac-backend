/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo;

import com.barbosaleo.dao.IClienteDAO;
import com.barbosaleo.domain.Cliente;
import com.barbosaleo.dao.ClienteDAOMock;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ClienteDAOTest {
    
    private final IClienteDAO clienteDAO;
    
    private Cliente cliente;
    
    public ClienteDAOTest(){
        clienteDAO = new ClienteDAOMock();
    }
    
    @Before
    public void init(){
        cliente = new Cliente(12L, "12312312312");
    }
    
    @Test
    public void consultarCliente(){
        Cliente clienteConsultado = clienteDAO.consultar(Long.valueOf(cliente.getCpf()));
        Assert.assertNotNull(clienteConsultado);
    }
    
    @Test
    public void cadastrarCliente() throws TipoChaveNaoEncontradaException{
        Boolean retorno = clienteDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void excluirCliente(){
        Boolean retorno = clienteDAO.excluir(Long.valueOf(cliente.getCpf()));
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        Boolean retorno = clienteDAO.alterar(cliente);
        Assert.assertTrue(retorno);
    }
}
