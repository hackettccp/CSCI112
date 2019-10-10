package Concurrency.Lab;

import java.io.File;
import java.util.Scanner;

/**
 * This class implements the Runnable interface.
 *
 * It has one constructor that accepts one File object as a parameter. The constructor should use this File object
 * to instantiate the fileReader (Scanner) field that has been provided. Assign the file's name (using it's getName() method)
 * to the fileName (String) field that has been provided. You'll need both of these fields in this class's run() method.
 *
 * In this class's run method, read in the text file using the Scanner (fileReader) and sum all of the numbers in the file.
 * Once the total has been calculated, print the file's name and the total of the values in the file.
 *
 * Be sure to use exception handling (try/catch) structures as needed.
 */
public class FileReaderThread implements Runnable {

    private Scanner fileReader = null;                               //Used to read the file passed to the constructor
    private String fileName = "";                                    //Used to store the file's name

    public FileReaderThread(File fileIn) {
        //TODO: Finish this constructor

    }

    public void run() {
        //TODO: Finish this method

    }

}
