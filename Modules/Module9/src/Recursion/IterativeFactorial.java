package Recursion;

/**
 * This program demonstrates the calculation of a factorial using an iterative approach.
 */
public class IterativeFactorial {

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
     * Iteratively calculates the result of !n
     */
    public static int factorial(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }

}
