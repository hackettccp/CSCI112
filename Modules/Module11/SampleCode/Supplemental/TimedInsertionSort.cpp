/**
 * Demonstrates timing the insertion sort.
 * 
 * Only interested in the time needed by the sort's algorithm.
 */

#include <iostream>
#include <ctime>
#include <chrono>

using namespace std;

//Prototypes
void insertionSort(int[], int);

/**
 * Main Function.
 */
int main() {
    const int LENGTH = 10000;                                                                       //Used to easily change/resize the array for testing with longer or shorter arrays
    int numbers[LENGTH];             
    
    srand((int)time(0));                                                                            //Sets the seed to the current time
    
    //Fills the array with random numbers. (May include some duplicate numbers.)
    for(int i = 0; i < LENGTH; i++) {
	    numbers[i] = rand() % 100 + 1;                                                              //Puts a random number between 1 and 100 at each index of the array.
	}

    cout << "Sorting..." << endl;
    insertionSort(numbers, LENGTH);
    cout << "Done." << endl;
    
    return 0;
}

/**
 * Insertion Sort Algorithm
 */
void insertionSort(int a[], int length) {
    cout << "Starting clock." << endl;
	auto start = chrono::system_clock::now();														//Gets the start time
    
    for(int i = 1; i < length; i++) {
		int value = a[i];
		int j = i-1;
		while(j >= 0 && a[j] > value) {
			a[j+1] = a[j];
			j--;
		}
		a[j+1] = value;
	}
    
    chrono::duration<double> totalTime = chrono::system_clock::now() - start;						//Calculates the total duration (now - start)
	cout << "Clock stopped." << endl;
	cout << "Finished in " << totalTime.count() << " seconds" << endl;
}

