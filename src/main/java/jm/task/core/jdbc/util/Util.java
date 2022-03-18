package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Util {
    private static String URL = "jdbc:mysql://localhost/database";
    private static String USERNAME = "root";
    private static String PASSWORD = "root";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection to  database succesfull!");
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            ex.printStackTrace();

        }
        return connection;
    }
}