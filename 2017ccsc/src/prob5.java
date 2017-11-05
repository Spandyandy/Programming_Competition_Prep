import java.util.*;
import java.io.*;

public class prob5 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        int total = t;
        float a,b,c;
        while(t-- != 0) {
            a = scan.nextFloat();
            b = scan.nextFloat();
            c = scan.nextFloat();
            double east = Math.sqrt(a*a+b*b) + (b-c);
            double west = a + c;
            if(east > west){
                System.out.println((total-t) +" go west");
            }else{
                System.out.println((total-t) +" go east");
            }
        }
    }
}