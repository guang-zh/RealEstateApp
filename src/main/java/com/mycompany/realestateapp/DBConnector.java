/*
 * DBConnector class with getConnection() method
 * Serves as MySQL database connection for other classes
 */

package com.mycompany.realestateapp;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author guang
 */
public class DBConnector {
    
    Connection con = null;
    
    public static Connection getDBconnection() throws SQLException {
         try {
            String driver = "com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/realestatedb","root","root");
            System.out.println("Connection Success");
            return con;
//            String query = "SELECT * FROM realestatedb.properties";
//            Statement statement = conn.createStatement();
//            statement.executeQuery(query);
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }
}
