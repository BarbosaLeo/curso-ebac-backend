/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.barbosaleo.dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Leonardo
 */
public class ConnectionFactory {
 
    private static Connection connection;

    public static Connection getConnection() throws SQLException{
        if(connection == null){
            connection = initConnection();        
        }
        else if(connection.isClosed()){
            connection = initConnection();
        }
        return connection;
    }
    
    private static Connection initConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection(
                    "jdbc:postgresql://localhost:15432/teste",
                    "admin",
                    "admin"
            );
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
