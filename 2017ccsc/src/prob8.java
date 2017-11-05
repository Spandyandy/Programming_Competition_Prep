import java.util.*;
import java.io.*;

public class prob8 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
        //Scanner scan = new Scanner(new File("./src/prob8.txt"));

        int t = scan.nextInt();

        while(t-- != 0) {
            String str1 = scan.next().toUpperCase();
            String str2 = scan.next().toUpperCase();
            int max = 0;
            int j = str1.length()-1;
            for(int i=1; i <= Math.min(str1.length(), str2.length()); i++){
                if(str1.substring(j,str1.length()).equals(str2.substring(0,i))){
                    max = str2.substring(0,i).length();
                }
                j--;
            }
            System.out.println(str1 + " and " + str2 + " have an overlap length of "+ max);
        }
    }
}