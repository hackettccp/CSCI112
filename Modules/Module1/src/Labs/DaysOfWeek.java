package Labs;

/**
 * Complete the isWeekend and whichComesFirst methods, which operate using enumerated data.
 *
 * When done correctly, all four tests will pass.
 * Do not modify anything other than the bodies of the isWeekend and whichComesFirst methods.
 */
public class DaysOfWeek {

    enum Day {SUN, MON, TUE, WED, THU, FRI, SAT}                                                         //Do not modify

    /**
     * Main Method. This is where the program begins. DO NOT MODIFY
     */
    public static void main(String[] args) {
        performTests();
    }

    /**
     * Returns true is the argument passed in on the weekend (Saturday or Sunday)
     * Otherwise, returns false;
     */
    public static boolean isWeekend(Day d1) {
        return false;                                                                                   //Placeholder to let the code compile. You may alter or remove.
    }

    /**
     * Of the two arguments passed to this method, return the day that is earliest in the week.
     */
    public static Day whichComesFirst(Day d1, Day d2) {
        return d1;                                                                                      //Placeholder to let the code compile. You may alter or remove.
    }

    /**
     * Runs the tests. DO NOT MODIFY
     */
    public static void performTests() {
        System.out.print("Test 1 ");
        if(isWeekend(Day.WED)) {
            System.out.println("Failed\n");
        }
        else {
            System.out.println("Passed\n");
        }

        System.out.print("Test 2 ");
        if(isWeekend(Day.SAT)) {
            System.out.println("Passed\n");
        }
        else {
            System.out.println("Failed\n");
        }

        System.out.print("Test 3 ");
        if(whichComesFirst(Day.MON, Day.FRI).equals(Day.MON)) {
            System.out.println("Passed\n");
        }
        else {
            System.out.println("Failed\n");
        }

        System.out.print("Test 4 ");
        if(whichComesFirst(Day.THU, Day.TUE).equals(Day.TUE)) {
            System.out.println("Passed\n");
        }
        else {
            System.out.println("Failed\n");
        }
    }
    
}
