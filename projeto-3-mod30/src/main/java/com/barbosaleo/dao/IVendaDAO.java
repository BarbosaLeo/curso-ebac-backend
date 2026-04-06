/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.dao.generic.IGenericDAO;
import com.barbosaleo.domain.Venda;

import com.barbosaleo.exceptions.DAOException;
import com.barbosaleo.exceptions.TipoChaveNaoEncontradaException;

/**
 *
 * @author Leonardo
 */
public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}
