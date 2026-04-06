/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.factory;

import com.barbosaleo.domain.Produto;
import com.barbosaleo.domain.ProdutoQuantidade;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class ProdutoQuantidadeFactory {

    public static ProdutoQuantidade convert(ResultSet rs) throws SQLException {
        Produto prod = ProdutoFactory.convert(rs);
        ProdutoQuantidade prodQ = new ProdutoQuantidade();
        prodQ.setProduto(prod);
        prodQ.setId(rs.getLong("ID"));
        prodQ.setQuantidade(rs.getInt("QUANTIDADE"));
        prodQ.setValorTotal(rs.getBigDecimal("VALOR_TOTAL"));
        return prodQ;
    }
}
