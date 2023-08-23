/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class Database {
    private Connection con;
    private Statement st;
    public Connection openConnection() throws SQLException {
        if(con == null) {
            String url = "jdbc:mysql://localhost:3306/";
            String dbName = "studentmanagement";
            String driver = "com.mysql.cj.jdbc.Driver";
            String userName = "root";
            String password = "";
            try {
                Class.forName(driver);
                this.con = (Connection)DriverManager.getConnection(url+dbName, userName, password);
                System.out.println("CONNECTION SUCCESS");
            }
            catch(ClassNotFoundException | SQLException sqle) {
                System.out.println("CONNECTION FAILED");
            }
        }
        return con;
    }
}
