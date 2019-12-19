package SampleCode_TextFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Demonstrates how to read a text file.
 */
class FileReader {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) throws Exception {
        Scanner fileReader = null;                                                          //Declares a Scanner object that has scope through the try/catch below

        try {
            File fileToRead = new File("src\\SampleCode_TextFiles\\SampleFile.txt");        //Instantiates a File object by providing the path to the file.
            fileReader = new Scanner(fileToRead);                                           //Instantiates a Scanner object /by providing it the fileToRead variable as the source.

            String line;                                                                    //Declares a String variable named line.

            while (fileReader.hasNextLine()) {                                              //Iterates through the fileReader's file.
                line = fileReader.nextLine();                                               //Assign the line of text from the file to the line String variable.
                System.out.println(line);                                                   //The value of the line variable is then printed.
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("File does not exist");                                      //Can't open the file
        }
        finally {
            try {
                fileReader.close();                                                         //Calls the fileReader variable's close method to release the file.
            }
            catch(Exception e) {
                //Do nothing; Scanner was still null
            }
        }
    }

}
