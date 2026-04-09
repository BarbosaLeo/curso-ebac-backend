/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao;

import com.barbosaleo.dao.generic.GenericDao;
import com.barbosaleo.domain.Marca;

/**
 *
 * @author Leonardo
 */
public class MarcaDao extends GenericDao<Marca,Long> implements IMarcaDao{
    public MarcaDao(){
        super();
    }
}
