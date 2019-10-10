package Lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Creates the inventory2 table needed for the lab.
 * Aside from maybe changing the postgres password, you should not need to change this program.
 */
public class CreateInventory2Table {

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
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Module8", username, password);                       //Create connection to database server
            System.out.println("Connected to 'CSCI112' database.");

            stmt = conn.createStatement();                                                                                       //Create a Statement object

            stmt.execute("CREATE TABLE inventory2 (name varchar(15), model varchar(5), quantity int, price double precision)");  //Execute the SQL statement to create a table
            System.out.println("inventory2 table successfully created.");

            stmt.executeUpdate("INSERT INTO inventory2 VALUES ('Hammer', '11A12', 34, 12.54)");                                  //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory2 VALUES ('Screwdriver', '10002', 15, 8.00)");                              //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory2 VALUES ('Saw', 'SW950', 22, 16.99)");                                     //Execute the SQL statement to insert a record
            stmt.executeUpdate("INSERT INTO inventory2 VALUES ('Wrench', '64BC3', 28, 10.95)");                                  //Execute the SQL statement to insert a record

        }
        catch(SQLException e) {
            System.out.println("Error with database: " + e.getMessage());
        }
        finally {
            try {
                stmt.close();                                                                                                    //Try to close statement
                conn.close();                                                                                                    //Try to close connection
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
            }
        }
    }

}
