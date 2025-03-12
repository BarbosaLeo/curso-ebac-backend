/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.testesjunit4.services;

import com.barbosaleo.testesjunit4.dao.IContratoDao;

/**
 *
 * @author Leonardo
 */
public class ContratoService implements IContratoService {

    IContratoDao contratoDao;
    
    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Sucesso";
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Sucesso";
    }
    
}
