package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileUtil {
    public static String parseSQLFile(String fileName) {

        StringBuilder sql = new StringBuilder();
        try {
            // Open file for reading
            FileInputStream fis = new FileInputStream("./" + fileName);
            Scanner sc = new Scanner(fis);

            // Read file line by line
            while (sc.hasNextLine()) {
                sql.append(sc.nextLine()).append(" ");
            }

            sc.close();
            fis.close(); // optional, but good practice
        } catch (IOException e) {
            System.out.println("Error reading file: " + fileName);
            e.printStackTrace();
        }

        return sql.toString().trim();
    }
}
