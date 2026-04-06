/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.services;

import com.barbosaleo.dao.IClienteDAO;
import com.barbosaleo.domain.Cliente;
import com.barbosaleo.exceptions.DAOException;
import com.barbosaleo.exceptions.MaisDeUmRegistroException;
import com.barbosaleo.exceptions.TableException;
import com.barbosaleo.services.generic.GenericService;

/**
 *
 * @author Leonardo
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    public ClienteService(IClienteDAO dao){
        super(dao);
    }
    
    @Override
    public Cliente buscarPorCpf(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
