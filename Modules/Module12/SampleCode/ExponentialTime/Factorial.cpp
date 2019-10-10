/**
 * Demonstrates a recursive solution to finding a factorial.
 */
#include<iostream>

using namespace std;

//Prototype
int factorial(int);

/**
 * Main Function.
 */
int main() {
	cout << "Enter the factorial to solve for: ";
	int fact;
	cin >> fact;
	int result = factorial(fact);
	cout << fact << "! = " << result << endl;
	return 0;
}

/**
 * Solves a factorial. 
 */
int factorial(int n) {
	if(n == 0) {
		return 1;							//Base Case
	}
	else {
		return n * factorial(n - 1);		//Recursive Case
	}
}

