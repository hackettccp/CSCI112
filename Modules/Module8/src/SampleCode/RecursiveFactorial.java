package SampleCode;

/**
 * This program demonstrates the calculation of a factorial using a recursive approach.
 */
public class RecursiveFactorial {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println(number + "! = " + result);
    }

    /**
     * Factorial Method.
     * Recursively calculates the result of !n
     */
    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

}
