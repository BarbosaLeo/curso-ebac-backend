/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.IClienteDAO;
import com.barbosaleo.domain.Cliente;
import com.barbosaleo.exceptions.DAOException;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import com.barbosaleo.services.ClienteService;
import com.barbosaleo.services.IClienteService;
import com.barbosaleo.test.dao.ClienteDaoMock;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(12312312312L);
        cliente.setNome("Rodrigo");
        cliente.setCidade("São Paulo");
        cliente.setEnd("End");
        cliente.setEstado("SP");
        cliente.setNumero(10);
        cliente.setTel(1199999999L);

    }

    @Test
    public void pesquisarCliente() throws DAOException {
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clienteService.cadastrar(cliente);

        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Rodrigo Pires");
        clienteService.alterar(cliente);

        Assert.assertEquals("Rodrigo Pires", cliente.getNome());
    }
}
