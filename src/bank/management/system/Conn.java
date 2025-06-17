package bank.management.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    public Conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish Connection
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "avinash@123");
            s = c.createStatement();
        } catch (Exception e) {
            System.out.println("Database connection error: " + e);
        }
    }
}
