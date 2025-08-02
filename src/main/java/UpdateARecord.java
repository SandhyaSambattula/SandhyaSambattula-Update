import Util.ConnectionUtil;
import Util.FileUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * SQL sublanguage: DML (Data Manipulation Language)
 *
 * To update a record we utilize the UPDATE keyword.
 * Syntax: UPDATE table_name SET col1 = val1, col2 = val2 WHERE condition;
 */
public class UpdateARecord {

    public void problem1() {
        // Problem 1: Update Alexa's last name to be 'Rush' in the site_user table.
        String sql = FileUtil.parseSQLFile("problem1.sql");

        try {
            Connection connection = ConnectionUtil.getConnection();
            Statement s = connection.createStatement();
            s.executeUpdate(sql);
            System.out.println("Update successful.");
        } catch (SQLException e) {
            System.out.println("problem1: " + e.getMessage());
        }
    }

    // ✅ Correctly placed main method (outside problem1 method)
    public static void main(String[] args) {
        UpdateARecord obj = new UpdateARecord();
        obj.problem1(); // Call the update method
    }
}
