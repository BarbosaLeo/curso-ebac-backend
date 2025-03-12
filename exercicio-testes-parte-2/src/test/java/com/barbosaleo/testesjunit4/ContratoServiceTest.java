/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.barbosaleo.testesjunit4;

import com.barbosaleo.testesjunit4.dao.ContratoDao;
import com.barbosaleo.testesjunit4.dao.ContratoDaoMock;
import com.barbosaleo.testesjunit4.dao.IContratoDao;
import com.barbosaleo.testesjunit4.services.ContratoService;
import com.barbosaleo.testesjunit4.services.IContratoService;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Leonardo
 */
public class ContratoServiceTest {
    
    public ContratoServiceTest() {
    }
    
    @Test
    public void salvarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarBancoDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.salvar();
        
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void buscarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoBuscarBancoDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test
    public void excluirTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoExcluirBancoDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.excluir();
    }
    
    @Test
    public void atualizarTest(){
        IContratoDao dao = new ContratoDaoMock();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso", retorno);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoAtualizarBancoDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService(dao);
        String retorno = service.atualizar();
        
        Assert.assertEquals("Sucesso", retorno);
    }
    
}
