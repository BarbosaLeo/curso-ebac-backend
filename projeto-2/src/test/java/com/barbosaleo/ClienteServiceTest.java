/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.barbosaleo;

import com.barbosaleo.dao.ClienteDAOMock;
import com.barbosaleo.dao.IClienteDAO;
import com.barbosaleo.domain.Cliente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import com.barbosaleo.service.ClienteService;
import com.barbosaleo.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ClienteServiceTest {

    private final IClienteService clienteService;
    private final IClienteDAO clienteDAO;
    private Cliente cliente;
    
    public ClienteServiceTest(){
        clienteDAO = new ClienteDAOMock();
        clienteService = new ClienteService(clienteDAO);
    }
    
    @Before
    public void init(){
        cliente = new Cliente(12L, "11122233312");
    }
    
    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.consultar(cliente.getId());
        Assert.assertNotNull(clienteConsultado);
    }
    
    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException{
        Boolean retorno = clienteService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void excluirCliente(){
        Boolean retorno = clienteService.excluir(cliente.getId());
        Assert.assertTrue(retorno);
    }
    
    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException{
        cliente.setNome("Pablo");
        clienteService.alterar(cliente);
        
        Assert.assertEquals("Pablo", cliente.getNome());
    }
}
