package SampleCode;

/**
 * This program demonstrates the calculation of a fibonacci series using an iterative approach.
 */
public class IterativeFibonacci {

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
     * Iteratively calculates the nth value of the series
     */
    public static int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        for(int i = 0; i < n; i++){
            int temp = n1;
            n1 = n2;
            n2 = temp + n2;
        }
        return n1;
    }


}
