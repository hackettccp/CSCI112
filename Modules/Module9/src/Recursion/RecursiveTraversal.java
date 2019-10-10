package Recursion;

import java.io.File;

/**
 * Demonstrates recursively traversing a directory.
 */
public class RecursiveTraversal {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        File rootDirectory = new File("src");
        listRecursively(rootDirectory);
    }

    /**
     * Recursively traverses the supplied directory using a depth-first traversal
     */
    public static void listRecursively(File directory) {
        System.out.println("CURRENT: " + directory.getPath());                                  //Prints the current directory it is in
        File[] contents = directory.listFiles();                                                //Gets the contents of the directory
        for(File f : contents) {                                                                //Looks at directories first to ensure we reach the maximum depth before looking at files
            if(f.isDirectory()) {
                listRecursively(f);
            }
        }
        for(File f : contents) {                                                                //Prints the name/path of each file in the directory
            if(f.isFile()) {
                System.out.println(f.getPath());
            }
        }
    }

}
