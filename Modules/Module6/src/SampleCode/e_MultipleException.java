package SampleCode;

/**
 * This program demonstrates multiple catch clauses.
 *
 */
class e_MultipleException {

    /*
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        String strArray[] = {"index_zero", "index_one", "index_two"};
        String testString = "Atlantic";
        String numberString = "1234";

        try {
            System.out.println(strArray[0]);                                    //OK
            //System.out.println(strArray[3]);                                  //Will throw an Exception
            int myInt = Integer.parseInt(numberString);                         //OK
            //int myInt = Integer.parseInt(testString);                         //Will throw an Exception
        } 
        catch (NumberFormatException ex) {
            System.out.println("NumberFormatException catch");
            ex.printStackTrace();
        } 
        catch (Exception ex) {
            System.out.println("Exception catch");
            ex.printStackTrace();
        }

        System.out.println("Program Complete");
    }
}
