/**
 * Program that demonstrates clock_t objects.
 * This program calls the clock() function (from ctime) to get the current time.
 * The difference between two times allows us to measure the duration of the process.
 */

#include <iostream>
#include <ctime>
#include <chrono>

using namespace std;

/**
 * Main Function.
 */
int main() {

    cout << "Starting clock." << endl;
	auto start = chrono::system_clock::now();											//Gets the start time

	std::srand((int)time(0));
	for(int i = 0; i < 200000000; i++) {
	 	int x = rand() % 100 + 1;           											//Gets 200 million random numbers; Just something that takes a little time to complete
	}
	
	chrono::duration<double> totalTime = chrono::system_clock::now() - start;			//Calculates the total duration (now - start)
	cout << "Clock stopped." << endl;
	cout << "Finished in " << totalTime.count() << " seconds" << endl;


    return 0;
}