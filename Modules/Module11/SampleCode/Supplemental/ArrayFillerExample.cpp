/**
 * Program that fills an array with random numbers.
 */

#include <iostream>
#include <ctime>

using namespace std;

/**
 * Main Function.
 */
int main() {
    
    const int LENGTH = 100;
    int numbers[LENGTH];             
    
    srand((int)time(0));
    for(int i = 0; i < LENGTH; i++) {
	    numbers[i] = rand() % 100 + 1;
	}

    return 0;
}