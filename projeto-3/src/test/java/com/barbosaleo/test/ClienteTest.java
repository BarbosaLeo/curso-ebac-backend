/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.generic.jdbc.dao.ClienteDAO;
import com.barbosaleo.dao.generic.jdbc.dao.IClienteDAO;
import com.barbosaleo.domain.Cliente;
import java.util.List;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

/**
 *
 * @author Leonardo
 */
public class ClienteTest {
    
    private IClienteDAO clienteDAO;
    
    @Before
    public void init() {
        clienteDAO = new ClienteDAO();
    }
    
    @Test
    public void cadastrarTest() throws Exception {
        Cliente cliente = new Cliente("Leonardo", "12");
        Integer countCadastro = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro == 1);
        
        Cliente clienteDB = clienteDAO.buscar("12");
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        
        Integer countDel = clienteDAO.excluir(clienteDB);
        assertTrue(countDel == 1);
        
    }
    
    @Test
    public void consultarTest() throws Exception {
        Cliente cliente = new Cliente("Leonardo", "12");
        Integer countCadastro = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro == 1);
        
        Cliente clienteDB = clienteDAO.buscar("12");
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        
        Integer countDel = clienteDAO.excluir(clienteDB);
        assertTrue(countDel == 1);
        
    }
    
    @Test
    public void excluirTest() throws Exception {
        Cliente cliente = new Cliente("Leonardo", "12");
        Integer countCadastro = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro == 1);
        
        Cliente clienteDB = clienteDAO.buscar("12");
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        
        Integer countDel = clienteDAO.excluir(clienteDB);
        assertTrue(countDel == 1);
        
    }
    
    @Test
    public void buscarTodosTest() throws Exception {
        Cliente cliente = new Cliente("Leonardo", "12");
        Integer countCadastro = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro == 1);
        
        Cliente cliente2 = new Cliente("Teste", "13");
        Integer countCadastro2 = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro2 == 1);
        
        
        List<Cliente> list = clienteDAO.buscarTodos();
        assertNotNull(list);
        assertEquals(2, list.size());
        
        int countDelete = 0;
        for(Cliente c : list){
            clienteDAO.excluir(c);
            countDelete++;
        }
        assertEquals(list.size(),countDelete);
        
        list = clienteDAO.buscarTodos();
        assertEquals(list.size(),0);
    }
    
    @Test
    public void atualizarTest() throws Exception {
        Cliente cliente = new Cliente("Leonardo", "12");
        Integer countCadastro = clienteDAO.cadastrar(cliente);
        assertTrue(countCadastro == 1);
    
        Cliente clienteDB = clienteDAO.buscar("12");
        assertNotNull(clienteDB);
        assertEquals(cliente.getNome(), clienteDB.getNome());
        assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
        
        clienteDB.setCodigo("15");
        clienteDB.setNome("Teste");
        Integer countAtualizar = clienteDAO.atualizar(clienteDB);
        assertTrue(countAtualizar == 1);
        
        Cliente clienteDB1 = clienteDAO.buscar("12");
        assertNull(clienteDB1);
        
        Cliente clienteDB2 = clienteDAO.buscar("15");
        assertNotNull(clienteDB2);
        assertEquals(cliente.getNome(), clienteDB2.getNome());
        assertEquals(cliente.getCodigo(), clienteDB2.getCodigo());
        
        List<Cliente> list = clienteDAO.buscarTodos();
        for(Cliente c : list){
            clienteDAO.excluir(c);
        }
    }
    
    
}
