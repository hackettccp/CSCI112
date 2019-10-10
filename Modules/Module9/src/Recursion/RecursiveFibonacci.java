package Recursion;

/**
 * This program demonstrates the calculation of a fibonacci series using a recursive approach.
 */
public class RecursiveFibonacci {

    /**
     * Main Method. This is where the program begins.
     */
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            int result = fib(i);
            System.out.print(result + " ");
        }
        System.out.println();

    }

    /**
     * Fibonacci Method.
     * Recursively calculates the nth value of the series
     */
    public static int fib(int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        else {
            return fib(n - 1) + fib(n - 2);
        }
    }

}
