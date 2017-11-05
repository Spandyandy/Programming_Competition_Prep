
// DELETE THE PACKAGE STATEMENT OR ELSE
import java.util.*;
import java.io.*;

public class prob1 {
    public static void main(String[] args) throws FileNotFoundException {

        //Scanner scan = new Scanner(new File("./src/prob1.txt"));
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> stateToCount = new HashMap<>();
        // one or more strings so this is okay
        String state = scan.next();
        String ecl = scan.next();
        int F = 0;
        int P = 0;
        int N = 0;
        while(!state.equals("-1")) {
            // make count of all states
            stateToCount.put(state, stateToCount.containsKey(state) ? stateToCount.get(state) + 1 : 1);

            if(ecl.equals("F")) {
                F++;
            } else if(ecl.equals("N")) {
                N++;
            } else {
                P++;
            }
            state = scan.next();
            if(state.equals("-1")) {
                break;
            }
            ecl = scan.next();
        }

        int numStates = stateToCount.size();
        // Find state with most responses
        int maxState = Integer.MIN_VALUE;
        String maxStateName = "";
        for (Map.Entry<String, Integer> stringIntegerEntry : stateToCount.entrySet()) {
            if(stringIntegerEntry.getValue() > maxState) {
                maxState = stringIntegerEntry.getValue();
                maxStateName = stringIntegerEntry.getKey();
            }
        }

        System.out.println("Different States Surveyed = " + numStates);
        System.out.println("Total Full Eclipses Reported = " + F);
        System.out.println("Total Partial Eclipses Reported = " + P);
        System.out.println("Total No Eclipses Reported = " + N);
        System.out.println("State With Most Responses = " + maxStateName);
    }
}