/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.domain.Cliente;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;
import java.util.Collection;

/**
 *
 * @author Leonardo
 */
public class ClienteDAOMock implements IClienteDAO {

    public ClienteDAOMock() {
        
    }

    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public Boolean excluir(Long valor) {
        return true;
    }

    @Override
    public Boolean alterar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
    
}
