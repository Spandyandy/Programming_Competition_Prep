import java.util.*;
import java.io.*;

public class prob6 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(new File("./input/prob6_in.txt"));

        int t = scan.nextInt();

        while (t-- != 0) {
            String m = scan.next();
            String f = scan.next();
            String d = scan.next();
            m = m.toLowerCase();
            f = f.toLowerCase();
            d = d.toLowerCase();
           // if(!isFFLValid(f, d, m)) {
           //      System.out.println("No link");
           //  }
            if (!d.contains(f.substring(0,1))) {
                System.out.println("No link");
            }
            else{
                System.out.println(func(d, m));
            }
        }
    }

    public static boolean isFFLValid(String f, String d, String m) {
        char ffl = f.charAt(0);
        int a = 0;
        for (char c : m.toCharArray()) {
            if (c == ffl) {
                a++;
            }
        }
        int t = a + 1;
        int b = 0;
        for (char c : d.toCharArray()) {
            if (c == ffl) {
                b++;
            }
        }
        return b >= t;
    }

    public static String func(String d, String m) {
        int diff = d.length() - m.length();
        char[] mm = m.toCharArray();
        if (diff % 2 == 0) {
            int start = 0;
            int c = m.length();
            for (int i = 0; i < mm.length; i++) {
                for (int j = start; j < d.length(); j++) {
                    //System.out.println(d.charAt(j) + " " + mm[i]);
                    if (d.charAt(j) == mm[i]) {
                        if (d.length() > 1) {
                            start = j+1;
                        }
                        c--;
                        break;
                    }
                }
            }
            if (c != 0) {
                return "No link";
            } else {
                return "" + diff;
            }
        } else {
            int c = m.length();
            int start = 0;
            for (int i = mm.length - 1; i >= 0; i--) {
                for (int j = start; j < d.length(); j++) {
                    //System.out.println(d.charAt(j) + " " + mm[i]);
                    if (d.charAt(j) == mm[i]) {
                        if (d.length() > 1) {
                            start = j+1;
                        }
                        c--;
                        break;
                    }
                }
            }
            //System.out.println(c);
            if (c != 0) {
                return "No link";
            } else {
                return "" + diff;
            }
        }
    }
}