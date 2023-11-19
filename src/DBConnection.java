/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */

import java.sql.*;
import javax.swing.DefaultDesktopManager;
import javax.swing.JOptionPane;

public class DBConnection {
    
    //Data Members
    Connection con= null;
    Statement stmt= null;
    ResultSet result= null;
    
    public DBConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con= DriverManager.getConnection("jdbc:sqlserver://DESKTOP-KF4PROP:1433;databaseName=PMS;user=pmsroot;password=123;trustServerCertificate=true");
            stmt= con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ResultSet selectData(String sql) {
        try {
            result= stmt.executeQuery(sql);
            return  result;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    public Boolean insertData(String sql) {
        boolean isInsert= false;
        try {
            stmt.executeUpdate(sql);
            isInsert= true;
        } catch (SQLException e) {}
        return  isInsert;
    }
    
}