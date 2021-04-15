package DataBase;

import org.testng.annotations.Test;

import java.sql.*;

public class WhatIsJdbc {

    @Test
    public void testDatabase() throws ClassNotFoundException, SQLException {
        try {
            //url parameters
            String url = "jdbc:mysql://localhost:3306/mysql";
            String user = "root";
            String password = "root";

            //Connecting to the databse
            Class.forName("com.mysql.cj.jdbc.Driver"); //Connect to the driver
            System.out.println("Driver Loaded");
            Connection conn = DriverManager.getConnection(url, user, password); //connect to the database
            System.out.println("Successfully connect to the Database");

            //Executing sql queries
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("show columns from plugin;");
            String result = rs.getString("name");
            System.out.println(result);

        }catch (Exception e){
            System.out.println("ERROR:" + e.getMessage());
        }
    }
}

