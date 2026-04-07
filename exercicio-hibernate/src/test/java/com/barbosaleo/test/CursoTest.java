/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.barbosaleo.test;

import com.barbosaleo.dao.CursoDao;
import com.barbosaleo.dao.ICursoDao;
import com.barbosaleo.domain.Curso;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Leonardo
 */
public class CursoTest {
    
    private ICursoDao cursoDao;
    
    public CursoTest() {
        cursoDao = new CursoDao();
    }
    
    @Test
    public void cadastro() {
        Curso curso = new Curso();
        curso.setCodigo("a1");
        curso.setNome("CURSO TESTE");
        curso.setDescricao("JAVA BACKEND");
        curso = cursoDao.cadastrar(curso);
        
        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
