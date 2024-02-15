/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Config;

/**
 *
 * @author luisr_6g40j75
 */

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    
    static Connection connection;
    static String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
    static String user = "root";
    static String password = "adminuser";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection Established");
        } catch (Exception e) {
            System.err.println("Connection Error: " + e.toString());
        }
        
        return connection;
    }
}
