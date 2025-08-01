package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    // H2 connection string: creates a file-based DB at ./h2/db
    private static String url = "jdbc:h2:./h2/db";
    private static String username = "sa";
    private static String password = "sa";

    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}
