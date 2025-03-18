/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.generic.jdbc.dao;

import com.barbosaleo.dao.generic.jdbc.ConnectionFactory;
import com.barbosaleo.domain.Produto;
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
public class ProdutoDAO implements IProdutoDAO{

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(getSqlCadastrar());
            addParametrosInsert(stm,produto);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(conn, stm, null);
        }
    }

    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(getSqlAtualizar());
            addParametrosUpdate(stm,produto);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(conn, stm, null);
        }
    }

    @Override
    public Produto buscar(String codigo) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(getSqlBuscar());
            addParametrosSelect(stm,codigo);
            rs = stm.executeQuery();
            if(rs.next()){
                produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
            }
            return produto;
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(conn, stm, rs);
        }
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        List<Produto> list = new ArrayList<>();
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(getSqlBuscarTodos());
            rs = stm.executeQuery();
            while(rs.next()){
                Produto produto = new Produto();
                produto.setId(rs.getLong("id"));
                produto.setCodigo(rs.getString("codigo"));
                produto.setNome(rs.getString("nome"));
                produto.setValor(rs.getDouble("valor"));
                
                list.add(produto);
            }
            return list;
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(conn, stm, rs);
        }
    }

    @Override
    public Integer excluir(Produto produto) throws Exception {
        Connection conn = null;
        PreparedStatement stm = null;
        try {
            conn = ConnectionFactory.getConnection();
            stm = conn.prepareStatement(getSqlExcluir());
            addParametrosDelete(stm,produto);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(conn, stm, null);
        }
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

    private String getSqlCadastrar() {
        return "INSERT INTO TB_PRODUTO_TEST(ID,NOME,CODIGO,VALOR) VALUES( NEXTVAL('SQ_PRODUTO_TEST'),?,?,?)";
    }

    private void addParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getNome());
        stm.setString(2,produto.getCodigo());
        stm.setDouble(3, produto.getValor());
    }

    private String getSqlBuscar() {
        return "SELECT * FROM TB_PRODUTO_TEST WHERE CODIGO = ?";
    }

    private void addParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    private String getSqlBuscarTodos() {
        return "SELECT * FROM TB_PRODUTO_TEST";
    }

    private String getSqlAtualizar() {
        return "UPDATE TB_PRODUTO_TEST SET CODIGO = ?, NOME = ?, VALOR = ? WHERE ID = ?";
    }

    private void addParametrosUpdate(PreparedStatement stm, Produto p) throws SQLException {
        stm.setString(1,p.getCodigo());
        stm.setString(2,p.getNome());
        stm.setDouble(3,p.getValor());
        stm.setLong(4,p.getId());
    }

    private String getSqlExcluir() {
        return "DELETE FROM TB_PRODUTO_TEST WHERE CODIGO = ?";
    }

    private void addParametrosDelete(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1,produto.getCodigo());
    }
}
