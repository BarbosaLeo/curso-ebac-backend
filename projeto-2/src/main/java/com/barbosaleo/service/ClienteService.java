/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.service;

import com.barbosaleo.dao.generics.IGenericDAO;
import com.barbosaleo.domain.Cliente;
import com.barbosaleo.service.generics.GenericService;

/**
 *
 * @author Leonardo
 */
public class ClienteService extends GenericService<Cliente> implements IClienteService{

    public ClienteService(IGenericDAO<Cliente> genericDAO) {
        super(genericDAO);
    }
    
}
