/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author darkrai
 */
public class connectDB {
    public Connection co = null;
    public Statement st = null;
    
    public void connect(){
        //Steps to create mysql database connexion(JDBC)
        //1-load driver
        try { 
            Class.forName("com.mysql.cj.jdbc.Dr");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, "Drivers inexistant", ex);
        }
        
        //2-Choose DB and establish connection
        try {
            co = DriverManager.getConnection("jdbc:mysql://localhost/mybase", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, "Connexion impossible", ex);
        }
        
        //3-Create Statement object
        try {
            st = co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(connectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    
    
}
