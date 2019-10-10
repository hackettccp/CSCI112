package SampleCode;

/**
 * This program demonstrates polymorphic references to exceptions.
 *
 */
class d_AnyException {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String strArray[] = {"index_zero", "index_one", "index_two"};
        String testString = "Atlantic";

        try {
            //System.out.println(strArray[3]);                              //Uncomment any one of these statements (All three throw different types of Exceptions)
            //System.out.println(testString.charAt(8));
            //int myInt = Integer.parseInt(testString);
        } 
        catch (Exception ex) {                                              //This catch block can handle any descendant/subclass of Exception that occurs in the try block
            ex.printStackTrace();
        }

        System.out.println("Program Complete");
    }

}
