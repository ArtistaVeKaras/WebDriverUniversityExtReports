package database;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SqlQuery extends DBConnection {

    private static org.apache.logging.log4j.Logger logger = LogManager.getLogger(SqlQuery.class);

    @Test
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
}

