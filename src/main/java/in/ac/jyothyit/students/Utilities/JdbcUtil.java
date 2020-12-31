/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in.ac.jyothyit.students.Utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author saaketh
 */
public class JdbcUtil {
    public static Connection getConnection(String dbName) {
        Connection connection = null;
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
        String username = "root";
        String password = "";
        
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
            
        } catch (ClassNotFoundException cnfe) {
            System.out.println(cnfe);
        } catch (SQLException sqle) {
            System.out.println(sqle);
        }
        
        return connection;
    }
    
    public static void closeConnection(Connection connection) {
        try {
            connection.close();
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }
    }
    
    public static void closeStatement(Statement statement) {
        try {
            statement.close();
        } catch(SQLException sqle) {
            System.out.println(sqle);
        }
    }
}
