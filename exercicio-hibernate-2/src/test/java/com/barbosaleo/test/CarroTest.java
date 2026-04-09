/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.AcessorioDao;
import com.barbosaleo.dao.CarroDao;
import com.barbosaleo.dao.IAcessorioDao;
import com.barbosaleo.dao.MarcaDao;
import com.barbosaleo.dao.ICarroDao;
import com.barbosaleo.dao.IMarcaDao;
import com.barbosaleo.domain.Acessorio;
import com.barbosaleo.domain.Carro;
import com.barbosaleo.domain.Marca;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leonardo
 */
public class CarroTest {
    
    private final ICarroDao carroDao;
    private final IMarcaDao marcaDao;
    private final IAcessorioDao acessorioDao;
    
    public CarroTest(){
        carroDao = new CarroDao();
        marcaDao = new MarcaDao();
        acessorioDao = new AcessorioDao();
    }
    
    @Test
    public void cadastrar(){
        
        Carro c = new Carro();
        c.setCodigo("A");
        c.setNome("Carro A");
        c.setValor(35000d);
        c.setMarca(marcaDao.cadastrar(new Marca("Marca A","A1")));
        
        Acessorio a1 = new Acessorio("A1","Acessorio 1","Descricao A1");
        Acessorio a2 = new Acessorio("A2","Acessorio 2","Descricao A2");
        c.addAcessorio(a1);
        c.addAcessorio(a2);
        
        c = carroDao.cadastrar(c);
        
        assertNotNull(c);
        assertNotNull(c.getId());
    }
    
}
