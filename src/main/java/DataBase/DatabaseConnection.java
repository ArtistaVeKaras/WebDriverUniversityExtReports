package DataBase;

import org.testng.annotations.Test;

import java.sql.*;

public class DatabaseConnection {

    @Test
    public void testDatabase() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        //url parameters
        String URL = "jdbc:mysql://localhost:3306/";
        String SCHEMEDATABASE = "user";
        String USERNAME = "root";
        String USER_PASSWORD = "root";

        try {
            //Connecting to the database
            Class.forName("com.mysql.cj.jdbc.Driver"); //Connect to the driver
            System.out.println("Driver Loaded!");
            Connection conn = DriverManager.getConnection(URL+SCHEMEDATABASE,USERNAME,USER_PASSWORD); //connect to the database
            System.out.println("Successfully connect to the Database!");

            //Executing sql queries selecting all form Persons table
            System.out.println("Executing queries...!");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from Persons");

            //Print every single record from the database users and the table Persons;
            while (rs.next())
            {
                String PersonID =rs.getString("PersonID");
                String FirstName = rs.getString("FirstName");
                String LastName = rs.getString("LastName");
                String Address = rs.getString("Address");
                String City = rs.getString("City");
                System.out.println("Database record is: " + PersonID + " " + FirstName + " "+ LastName + " " + Address + " " + City);
            }
        }catch (Exception e){
            System.out.println("ERROR:" + e.getMessage());
        }
        finally {
            {
                //Is mandatory to always close the connection otherwise no else is able to connect
                if (connection!=null){
                    connection.close();
            }
            }
        }
    }
}

