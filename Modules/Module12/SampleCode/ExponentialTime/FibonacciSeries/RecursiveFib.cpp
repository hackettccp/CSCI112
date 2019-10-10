/**
 * Demonstrates a recursive solution to find the first n numbers in the Fibonacci series.
 * 
 * Uses a long long type because the numbers are really large after about 46 numbers in the series.
 */
#include<iostream>

using namespace std;

//Prototype
long long fib(int);

/**
 * Main Function.
 */
int main() {
	//Finds the first 10 numbers in the Fibonacci series.
	for(int i = 0; i < 10; i++) {
		cout << fib(i) << " ";
	}
	cout << endl;
	return 0;
}

/**
 * Solves/returns the n'th number in the Fibonacci series 
 */
long long fib(int n) {
	if(n == 0 || n == 1) {
		return n;							//Base Case
	}
	else {
		return fib(n - 1) + fib(n - 2);		//Recursive Case
	}
}
