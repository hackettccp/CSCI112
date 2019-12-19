package SampleCode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Demonstrates selecting records from a table
 */
public class SelectInventoryRecords {

    private static Connection conn;                                                                                     //Connection object used by all methods
    private static Statement stmt;                                                                                      //Statement object used by all methods

    /**
     * Main method.
     * This is where the program begins.
     */
    public static void main(String[] args) {
        conn = null;
        stmt = null;
        String username = "postgres";
        String password = "CSCI112ONLINE";   //Update this if you used a different password

        try {
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Module8", username, password);              //Create connection to database server
            System.out.println("Connected to 'CSCI112' database.\n");

            stmt = conn.createStatement();                                                                              //Create a Statement object

            System.out.println("---EXAMPLE 1---\n");
            example1();                                                                                                 //Calls example1
            System.out.println("---EXAMPLE 2---\n");
            example2();                                                                                                 //Calls example2
            System.out.println("---EXAMPLE 3---\n");
            example3();                                                                                                 //Calls example3
            System.out.println("---EXAMPLE 4 (qty > 20)---\n");
            example4(20);                                                                                               //Calls example4
            System.out.println("---EXAMPLE 4 (qty > 500)---\n");
            example4(500);                                                                                              //Calls example4 (should select no records)

        }
        catch(SQLException e) {
            System.out.println("Error with database: " + e.getMessage());
        }
        finally {
            try {
                stmt.close();                                                                                           //Try to close statement
                conn.close();                                                                                           //Try to close connection
            }
            catch(Exception e) {
                //Connection wasn't opened; Do nothing.
            }
        }
    }

    /**
     * Example 1 - Selects all records from the inventory table
     */
    public static void example1() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM inventory");                                                          //Selects everything from inventory table
            if(rs.isBeforeFirst()) {                                                                                    //Makes sure at least one record was selected
                while(rs.next()) {                                                                                      //Iterates through each record
                    double price = rs.getDouble("price");                                                               //Assigns the fields of the record to variables
                    String name = rs.getString("name");
                    String model = rs.getString("model");
                    int quantity = rs.getInt("quantity");

                    System.out.println("Name: " + name);                                                                //Prints the values of the fields
                    System.out.println("Model: " + model);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Price: $" + price);
                    System.out.println();
                }
            }
            else {
                System.out.println("No records selected.");
            }
        }
        catch(SQLException e) {
            System.out.println("Error selecting from table: " + e.getMessage());
        }
        finally {
            try {
                rs.close();                                                                                             //Try to close the ResultSet
            }
            catch(Exception e) {
                //ResultSet still null/nothing to close
            }
        }
    }

    /**
     * Example 2 - Selects only the name field from all records from the inventory table
     */
    public static void example2() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT name FROM inventory");                                                       //Selects the name field from all records in the inventory table
            if(rs.isBeforeFirst()) {                                                                                    //Makes sure at least one record was selected
                while(rs.next()) {                                                                                      //Iterates through each record
                    String name = rs.getString("name");                                                                 //Assigns the fields of the record to variables

                    System.out.println("Name: " + name);                                                                //Prints the values of the fields
                    System.out.println();
                }
            }
            else {
                System.out.println("No records selected.");
            }
        }
        catch(SQLException e) {
            System.out.println("Error selecting from table: " + e.getMessage());
        }
        finally {
            try {
                rs.close();                                                                                             //Try to close the ResultSet
            }
            catch(Exception e) {
                //ResultSet still null/nothing to close
            }
        }
    }

    /**
     * Example 3 - Selects any records from the inventory table where the price is less than 12.99
     */
    public static void example3() {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM inventory WHERE price < 12.99");                                      //Selects any records (all fields) from the inventory table where price is less than 12.99
            if(rs.isBeforeFirst()) {                                                                                    //Makes sure at least one record was selected
                while(rs.next()) {                                                                                      //Iterates through each record
                    double price = rs.getDouble("price");                                                               //Assigns the fields of the record to variables
                    String name = rs.getString("name");
                    String model = rs.getString("model");
                    int quantity = rs.getInt("quantity");

                    System.out.println("Name: " + name);                                                                //Prints the values of the fields
                    System.out.println("Model: " + model);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Price: $" + price);
                    System.out.println();
                }
            }
            else {
                System.out.println("No records selected.");
            }
        }
        catch(SQLException e) {
            System.out.println("Error selecting from table: " + e.getMessage());
        }
        finally {
            try {
                rs.close();                                                                                             //Try to close the ResultSet
            }
            catch(Exception e) {
                //ResultSet still null/nothing to close
            }
        }
    }

    /**
     * Example 4 - Selects any records from the inventory table where the quantity is greater than the value of the parameter
     */
    public static void example4(int minQuantity) {
        ResultSet rs = null;
        try {
            rs = stmt.executeQuery("SELECT * FROM inventory WHERE quantity > " + minQuantity);                          //Selects the name field from all records in the inventory table
            if(rs.isBeforeFirst()) {                                                                                    //Makes sure at least one record was selected
                while(rs.next()) {                                                                                      //Iterates through each record
                    double price = rs.getDouble("price");                                                               //Assigns the fields of the record to variables
                    String name = rs.getString("name");
                    String model = rs.getString("model");
                    int quantity = rs.getInt("quantity");

                    System.out.println("Name: " + name);                                                                //Prints the values of the fields
                    System.out.println("Model: " + model);
                    System.out.println("Quantity: " + quantity);
                    System.out.println("Price: $" + price);
                    System.out.println();
                }
            }
            else {
                System.out.println("No records selected.");
            }
        }
        catch(SQLException e) {
            System.out.println("Error selecting from table: " + e.getMessage());
        }
        finally {
            try {
                rs.close();                                                                                             //Try to close the ResultSet
            }
            catch(Exception e) {
                //ResultSet still null/nothing to close
            }
        }
    }

}
