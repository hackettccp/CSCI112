package SampleCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Demonstrates inserting records to a table
 */
public class InsertInventoryRecords2 {

    /**
     * Main method.
     * This is where the program begins.
     */
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        String username = "postgres";
        String password = "CSCI112ONLINE";   //Update this if you used a different password

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Module8", username, password);                          //Create connection to database server
            System.out.println("Connected to 'CSCI112' database.");

            stmt = conn.createStatement();                                                                                          //Create a Statement object

            String name = "Pliers";
            String model = "XT51";
            int quantity = 13;
            double price = 11.99;

            stmt.executeUpdate("INSERT INTO inventory VALUES ('" + name + "', '" + model + "', " + quantity + ", " + price + ")");  //Execute the SQL statement to insert a record
            System.out.println("One row successfully inserted.");

        }
        catch(SQLException e) {
            System.out.println("Error with database: " + e.getMessage());
        }
        finally {
            try {
                stmt.close();                                                                                                       //Try to close statement
                conn.close();                                                                                                       //Try to close connection
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
            }
        }
    }

}
