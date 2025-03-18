/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.generic.jdbc.dao;

import com.barbosaleo.dao.generic.jdbc.ConnectionFactory;
import com.barbosaleo.domain.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class ClienteDAO implements IClienteDAO {

    @Override
    public Integer cadastrar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            addParametrosInsert(stm,cliente);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } 
        finally {
            closeConnection(connection,stm,null);
        }
    }

    @Override
    public Integer atualizar(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            addParametrosUpdate(stm,cliente);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } 
        finally {
            closeConnection(connection,stm,null);
        }
    }
    
    @Override
    public Integer excluir(Cliente cliente) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelete();
            stm = connection.prepareStatement(sql);
            addParametrosDelete(stm,cliente);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } 
        finally {
            closeConnection(connection,stm,null);
        }
    }
    
    @Override
    public Cliente buscar(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            addParametrosSelect(stm,codigo);
            rs = stm.executeQuery();
            if(rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getLong("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCodigo(rs.getString("CODIGO"));
            }
            
        } catch(Exception e){
            throw e;
        } 
        finally {
            closeConnection(connection,stm,rs);
        }
        return cliente;
    }

    @Override
    public List<Cliente> buscarTodos() throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();
        Cliente cliente = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelectAll();
            stm = connection.prepareStatement(sql);
            rs = stm.executeQuery();
            while(rs.next()){
                cliente = new Cliente();
                cliente.setId(rs.getLong("ID"));
                cliente.setNome(rs.getString("NOME"));
                cliente.setCodigo(rs.getString("CODIGO"));
                clientes.add(cliente);
            }
        } catch(Exception e){
            throw e;
        } 
        finally {
            closeConnection(connection,stm,rs);
        }
        return clientes;
    }

    private String getSqlInsert() {
        StringBuilder builder = new StringBuilder();
        builder.append("INSERT INTO TB_CLIENTE(ID,CODIGO,NOME) ");
        builder.append("VALUES(NEXTVAL('SQ_CLIENTE'),?,?);");
        return builder.toString();
    }

    private void addParametrosInsert(PreparedStatement stm, Cliente cliente) throws SQLException{
        stm.setString(1, cliente.getCodigo());
        stm.setString(2, cliente.getNome());
    }
    
    private String getSqlUpdate() {
        StringBuilder builder = new StringBuilder();
        builder.append("UPDATE TB_CLIENTE");
        builder.append("SET CODIGO = ?, NOME = ?");
        builder.append("WHERE ID = ?");
        return builder.toString();
    }

    private void addParametrosUpdate(PreparedStatement stm, Cliente cliente) throws SQLException{
        stm.setString(1, cliente.getCodigo());
        stm.setString(2, cliente.getNome());
        stm.setLong(3, cliente.getId());
    }

    private String getSqlDelete() {
        StringBuilder builder = new StringBuilder();
        builder.append("DELETE FROM TB_CLIENTE");
        builder.append("WHERE CODIGO = ?");
        return builder.toString();
    }

    private void addParametrosDelete(PreparedStatement stm, Cliente cliente) throws SQLException {
        stm.setString(1,cliente.getCodigo());
    }

    private String getSqlSelect() {
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM TB_CLIENTE");
        builder.append("WHERE CODIGO = ?");
        return builder.toString();
    }

    private void addParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    private String getSqlSelectAll() {
        StringBuilder builder = new StringBuilder();
        builder.append("SELECT * FROM TB_CLIENTE");
        return builder.toString();
    }
    
    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if(rs != null && !rs.isClosed()){
                rs.close();
            }
            if(stm != null && !stm.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
