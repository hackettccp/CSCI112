/**
 * For this lab project, you will time (in seconds) the performance of the two Fibonacci series algorithms.
 * 
 * One of the algorithms in the SampleCode uses an iterative algorithm and the other uses a recursive algorithm.
 * 
 * The algorithms' time complexities should allow us to predict how these algorithms will perform.
 * In the lecture slides, I said that:
 * The iterative version has linear time complexity
 * The recursive version has exponential time complexity
 * 
 * We'd expect the iterative version to be much faster.
 * 
 * Both the iterative and recursive functions are provided for you in functions below.
 * 
 * In the main function of this program:
 * -First have a for loop (like in the main function of IterativeFib.cpp) to find a series using the provided iterativeFib function.
 * -Have a second for loop (like in the main function of RecursiveFib.cpp) to find a series using the provided recursiveFib function.
 * -Use c_time objects to time the for loop that uses the iterative algorithm.
 * -Use additional c_time objects to time the other for loop that uses the recursive algorithm.
 * --Module 11 provided examples of using the c_time type for timing the algorithm.
 * 
 * 
 * !!!YOU WILL RUN YOUR COMPLETED PROGRAM FOUR TIMES AND MAKE NOTE OF THE RUNTIMES!!!
 * (Be sure to print the individual times of both for loops in the main method.)
 * Run the program to determine the time it takes to find/print the first 30 numbers in the Fibonacci Series. 
 * Run the program to determine the time it takes to find/print the first 35 numbers in the Fibonacci Series.
 * Run the program to determine the time it takes to find/print the first 40 numbers in the Fibonacci Series.
 * Run the program to determine the time it takes to find/print the first 45 numbers in the Fibonacci Series.
 * 
 * In the lab discussion, you will share your results and discuss if the algorithms performed how we expected them to.
 */
#include <iostream>
#include <ctime>

using namespace std;

//Prototypes
long long recursiveFib(int);
long long iterativeFib(int);

/**
 * Main Function.
 */
int main() {
    
    return 0;
}

/**
 * Recursive Fibonacci Series Algorithm
 * Solves/returns the n'th number in the Fibonacci series
 * (No changes needed)
 */
long long recursiveFib(int n) {
	if(n == 0 || n == 1) {
		return n;							                    //Base Case
	}
	else {
		return recursiveFib(n - 1) + recursiveFib(n - 2);		//Recursive Case
	}
}

/**
 * Iterative Fibonacci Series Algorithm
 * Solves/returns the n'th number in the Fibonacci series
 * (No changes needed)
 */
long long iterativeFib(int n) {
	long long n1 = 0;
	long long n2 = 1;
	for(int i = 0; i < n; i++){
		long long temp = n1;
		n1 = n2;
		n2 = temp + n2;
	}
	return n1;
}