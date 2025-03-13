/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.dao.generics.GenericDAO;
import com.barbosaleo.domain.Cliente;

/**
 *
 * @author Leonardo
 */
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO{

    public ClienteDAO(){
        super();
    }
    
    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entry, Cliente entityCadastrado) {
        entityCadastrado.setNome(entry.getNome());
        entityCadastrado.setCidade(entry.getCidade());
        entityCadastrado.setEstado(entry.getEstado());
        entityCadastrado.setEnd(entry.getEnd());
        entityCadastrado.setTel(entry.getTel());
    }

}
