package database;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Persons {

    private static Logger logger = LogManager.getLogger(Persons.class);

    public static void getPersons(ResultSet rs) throws SQLException {

        while (rs.next()) {

            StringBuffer buffer = new StringBuffer();

            buffer.append("Person_ID ").append(rs.getInt("PersonID")).append(" ");
            buffer.append(rs.getString("LastName")).append(" ");
            buffer.append(rs.getString("FirstName")).append(" ");
            buffer.append(rs.getString("Address")).append(" ");
            buffer.append(rs.getString("City" )).append(" ");
            logger.info(buffer.toString());

        }
    }
}
