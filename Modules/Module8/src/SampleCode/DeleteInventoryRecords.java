package SampleCode;

import java.sql.*;

/**
 * Demonstrates inserting records to a table
 */
public class DeleteInventoryRecords {

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
            conn = DriverManager.getConnection("jdbc:postgresql://localhost/Module8", username, password);              //Create connection to database server
            System.out.println("Connected to 'CSCI112' database.");

            stmt = conn.createStatement();                                                                              //Create a Statement object

            System.out.println("Deleting the Hammer record.");
            stmt.executeUpdate("DELETE FROM inventory where name = 'Hammer'");                                          //Deletes any records where the name field is 'Hammer'

            ResultSet rs = null;
            try {
                System.out.println("Selecting all records from database and printing only the name field:");
                rs = stmt.executeQuery("SELECT * FROM inventory");                                                      //Selects everything from inventory table
                if(rs.isBeforeFirst()) {                                                                                //Makes sure at least one record was selected
                    while(rs.next()) {                                                                                  //Iterates through each record
                        System.out.println("Name: " + rs.getString("name"));                                            //Prints the value of the record's name field
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
                    rs.close();                                                                                         //Try to close the ResultSet
                }
                catch(Exception e) {
                    //ResultSet still null/nothing to close
                }
            }

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

}
