package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The ConnectionUtil class will be utilized to create an active connection to our database. This class utilizes the singleton design pattern.
 * We will be utilizing an in-memory called h2database for the sql demos.
 */
public class ConnectionUtil {
    //TODO: figure
    //url will represent our connection string. Since this is an in-memory db, we will represent a file location to store the data
    private static String url = "jdbc:sqlite::memory:";
    private static String username = "sa";
    private static String password = "sa";

    private class Util {
        private static final String url = "jdbc:sqlite.music.db";

    /**
     * @return active connection to the database
     */
    public static Connection getConnection() throws SQLException {
        return
        DriverManager.getConnection (url);
    }
}
}
