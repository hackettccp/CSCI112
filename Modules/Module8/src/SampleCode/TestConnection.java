package SampleCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Tests that the Postgres DMBS is installed and that IntelliJ programs can connect to it.
 */
public class TestConnection {

    /**
     * Main method.
     * This is where the program begins.
     */
    public static void main(String[] args) {
        boolean test1 = false;
        boolean test2 = false;
        Connection conn = null;
        String username = "postgres";
        String password = "CSCI112ONLINE";   //Update this if you used a different password

        /**
         * Test 1: Connecting to a database that doesn't exist
         */
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/abcd", username, password);                 //Create connection to database server
            System.out.println("Connected to database.");
        }
        catch(SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            System.out.println("This is expected. We didn't make an 'abcd' database.");
            System.out.println("Test 1 Passed.");
            test1 = true;
        }
        finally {
            try {
                conn.close();                                                                                           //Try to close connection
                System.out.println("Connection to 'abcd' closed.");
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
                System.out.println("Can't close connection to 'abcd'. (This is OK because the connection was never opened.)");
            }
        }

        System.out.println();

        /**
         * Test 2: Connecting to a database that does/should exist
         */
        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Module8", username, password);              //Create connection to database server
            System.out.println("Connected to 'CSCI112' database.");
        }
        catch(SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
            System.out.println("This should NOT happen. Check that Postgres is running (start pgAdmin), check spelling of database name in URL, and check username/password.");
        }
        finally {
            try {
                conn.close();                                                                                           //Try to close connection
                System.out.println("Connection to 'CSCI112' closed.");
                System.out.println("Test 2 Passed.");
                test2 = true;
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
                System.out.println("Can't close connection to 'CSCI112'. (This shouldn't be printed.)");
            }
        }

        /**
         * How'd it go?
         */
        if(test1 && test2) {
            System.out.println("\nEverything is working correctly!");
        }
        else {
            System.out.println("\nTest was unsuccessful. Check the database server is running and that the URL and database names are correct.");
        }

    }

}
