package database;

import org.apache.logging.log4j.LogManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    //url parameters
    public static final String URL = "jdbc:mysql://localhost:3306/";
    public static final String SCHEMADATABASE = "user";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(DBConnection.class);

    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            //Connecting to the database
            Class.forName("com.mysql.cj.jdbc.Driver"); //Connect to the driver
            logger.debug("Driver Loaded!");
            logger.debug("Successfully connect to the Database!");
        }catch (Exception e){
            logger.error("No Connection Found!!");
        }
        return DriverManager.getConnection(URL+SCHEMADATABASE,USERNAME,PASSWORD);

    }
}
