import java.util.*;
import java.io.*;

public class prob7 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);

        long t = scan.nextLong();
        long k = 0;
        long v = 0;
        while(t-- != 0) {
            long temp = scan.nextLong();
            k += temp*(temp-1)/2;
            v += temp;
        }
        long val = ((v*(v-1))/2) - k;
        System.out.println(val%1000);


    }


}