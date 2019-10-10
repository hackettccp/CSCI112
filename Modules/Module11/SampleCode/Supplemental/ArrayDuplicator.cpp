#include <iostream>
#include <ctime>

using namespace std;

//Prototypes
void duplicate(int[], int[], int);
void printArray(int[], int);

/**
 * Main Function.
 */
int main() {
    
    const int LENGTH = 10;
    int array1[LENGTH];
    int array2[LENGTH];           
    
    srand((int)time(0));
    for(int i = 0; i < LENGTH; i++) {
	    array1[i] = rand() % LENGTH*2 + 1;
	}
    duplicate(array1, array2, LENGTH);

    printArray(array1, LENGTH);
    printArray(array2, LENGTH);

    return 0;
}

/**
 * Handles making deep copies of the original array.
 */
void duplicate(int orig[], int copy[], int length) {
    for(int i = 0; i < length; i++) {
		copy[i] = orig[i];
	}
}

/**
 * Simply prints the current values in the array.
 */
void printArray(int a[], int length) {
    cout << "Current values in the array: " << endl;
    for(int i = 0; i < length; i++) {
	    cout << a[i] << " ";
	}
    cout << endl;
}