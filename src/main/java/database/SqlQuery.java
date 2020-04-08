package database;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;

import java.sql.*;

public class SqlQuery extends DBConnection {

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(SqlQuery.class);
    public static final String SQL = "SELECT * from new_students WHERE Fee<=?";
    public static final String SQLInsertData = "insert into new_students (City, Email, Fee, FirstName, ID, LastName) values ('Moscow', 't45@outlook.com', 200, 'Prome', 11, 'E')";

    @Test
    //retrive data from Persons table
    public void retrieveDataFromSchema() throws SQLException, ClassNotFoundException {
        try (Connection conn = DBConnection.getConnection();
             Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = stm.executeQuery("select * from Persons");
        ) {
            //performing sql query from the persons class
            logger.info("Executing SQL queries!!");
            Persons.getPersons(rs);
        } catch (SQLException e) {
            logger.debug("ERROR: " + e.getMessage());
        }
    }
    @Test
    public void getInputFromUser() throws SQLException {
        double maxfee;
        try {
            maxfee = Input.getInt("Enter a maxmimum fee:");
        }catch (Exception e){
            logger.error("Error: Invalid number: ");
            return;
        }
        ResultSet rs = null;

        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement statement= conn.prepareStatement(SQL,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            statement.setDouble(1,maxfee);
            rs =statement.executeQuery();
            Persons.getPersons(rs);
        } catch (SQLException | ClassNotFoundException e) {
            logger.error(e.getMessage());
        }finally {
            if (rs!=null){
                rs.close();
            }
        }
    }

    @Test
    //insert data into the new_students table
    public void insertDataToDatabase() throws SQLException, ClassNotFoundException {
        try (Connection conn = DBConnection.getConnection();
             Statement stm = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
//             ResultSet rs = stm.executeUpdate(SQLInsertData);
//             TODO: solve this issues inserting data on the table is not working
        ) {
            //performing sql query from the persons class
            logger.info("Query executed successfully!!");
        } catch (SQLException e) {
            logger.debug("ERROR: " + e.getMessage());
        }
    }
}
