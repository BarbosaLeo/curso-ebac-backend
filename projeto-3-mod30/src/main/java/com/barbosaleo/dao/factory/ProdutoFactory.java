/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.factory;

import com.barbosaleo.domain.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class ProdutoFactory {

    public static Produto convert(ResultSet rs) throws SQLException {
        Produto prod = new Produto();
        prod.setId(rs.getLong("ID_PRODUTO"));
        prod.setCodigo(rs.getString("CODIGO"));
        prod.setNome(rs.getString("NOME"));
        prod.setMarca(rs.getString("MARCA"));
        prod.setDescricao(rs.getString("DESCRICAO"));
        prod.setValor(rs.getBigDecimal("VALOR"));
        return prod;
    }
}
