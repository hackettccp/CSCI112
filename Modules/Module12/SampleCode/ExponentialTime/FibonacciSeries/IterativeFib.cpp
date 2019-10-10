/**
 * Demonstrates an iterative solution to find the first n numbers in the Fibonacci series.
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
	long long n1 = 0;
	long long n2 = 1;
	for(int i = 0; i < n; i++){
		long long temp = n1;
		n1 = n2;
		n2 = temp + n2;
	}
	return n1;
}


