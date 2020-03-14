package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class WhatIsJdbc {

     public static void main(String[] args) {
            Connection conn = null;
            System.out.println("Hello!");

         try {
             //db parameters
             String url = "jdbc:mysql://localhost:2279/mysqljdbc";
             String user = "root";
             String password = "porto";

             //create a connection to the database
             conn = DriverManager.getConnection(url,user,password);
                 System.out.println("Connection successfull");


         } catch (SQLException e) {
             System.out.println("Error: " + e.getMessage());
         } finally {
            try {
                if(conn != null)
                    conn.close();
            }catch (SQLException ex){
                System.out.println("Error: " +ex.getMessage());
            }
         }


//         Connection conn = null;
//         try {
//             String url = "jdbc:sqlite:/home/claudio/Downloads/chinook/chinook.db";
//             conn = DriverManager.getConnection(url);
//
//             System.out.println("Got it!");
//
//         } catch (SQLException e) {
//             throw new Error("Problem", e);
//         } finally {
//             try {
//                 if (conn != null) {
//                     conn.close();
//                 }
//             } catch (SQLException ex) {
//                 System.out.println(ex.getMessage());
//             }
//         }
     }
}
