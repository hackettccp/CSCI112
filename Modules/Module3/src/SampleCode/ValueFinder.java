package SampleCode;

/**
 * This class contains four methods that return information about an array.
 *
 * There is a method for finding the index of a certain array element, determining
 * if a certain element exists in an array, finding the largest number in an array,
 * and finding the smallest number in an array.
 *
 *
 */
public class ValueFinder {
    
    /**
     * Returns the index of a particular value from an array.
     * (Returns -1 if the value is not in the array.)
     */
    public int findIndex(int value, int[] values) {
        int index = -1;
        
        for(int i = 0; i < values.length; i++) {
            if(values[i] == value) {                                    //Found the value. Remember the index and break from the loop
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Determines if a value is present in an array.
     * (Returns true if it is, else it returns false.)
     */
    public boolean exists(int value, int[] values) {
        for(int x : values) {
            if(x == value) {                                            //Found the value. Return true.
                return true;
            }
        }
        return false;
    }

    /**
     * Returns the largest the number in the array.
     */
    public int getMax(int[] values) {
        int max = values[0];                                            //Assumes the first value is largest
        for(int i = 1; i < values.length; i++) {
            if(values[i] > max) {                                       //Found a larger number
                max = values[i];
            }
        }
        return max;
    }

    /**
     * Returns the smallest the number in the array.
     */
    public int getMin(int[] values) {
        int min = values[0];                                            //Assumes the first value is smallest
        for(int i = 1; i < values.length; i++) {
            if(values[i] < min) {                                       //Found a smaller number
                min = values[i];
            }
        }
        return min;
    }
    
}
