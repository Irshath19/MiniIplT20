package iplpkg.DBFile;

import java.sql.*;
import java.util.*;
public class DBManipulation {
    public Connection con;
    public Statement stmt;
    Scanner in = new Scanner(System.in);
    public DBManipulation() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ipldb", "root", "");
            stmt = con.createStatement();
            // System.out.println("connected");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Connection getConnection() {
        return con;
    }
}