/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.services;

import com.barbosaleo.dao.IProdutoDAO;
import com.barbosaleo.domain.Produto;
import com.barbosaleo.services.generic.GenericService;

/**
 *
 * @author Leonardo
 */
public class ProdutoService extends GenericService<Produto, String> implements IProdutoService{
    
    public ProdutoService(IProdutoDAO dao){
        super(dao);
    }
    
}
