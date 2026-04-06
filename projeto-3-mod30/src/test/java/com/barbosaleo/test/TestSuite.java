/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Leonardo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    ClienteDAOTest.class,
    ClienteServiceTest.class,
    ProdutoDAOTest.class,
    ProdutoServiceTest.class,
    VendaDAOTest.class
})
public class TestSuite {
    
}
