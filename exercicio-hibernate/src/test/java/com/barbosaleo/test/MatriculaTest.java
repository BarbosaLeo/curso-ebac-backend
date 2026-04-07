/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.MatriculaDao;
import com.barbosaleo.dao.IMatriculaDao;
import com.barbosaleo.domain.Matricula;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

/**
 *
 * @author Leonardo
 */
public class MatriculaTest {
        
    private IMatriculaDao matriculaDao;
    
    public MatriculaTest() {
        matriculaDao = new MatriculaDao();
    }
    
    @Test
    public void cadastro() {
        Matricula matricula = new Matricula();
        matricula.setCodigo("a1");
        matricula.setValor(1200d);
        matricula.setStatus("ATIVO");
        matricula = matriculaDao.cadastrar(matricula);
        
        assertNotNull(matricula);
        assertNotNull(matricula.getId());
    }
}
