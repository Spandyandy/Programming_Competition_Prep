import java.util.*;
import java.io.*;

public class prob3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        //Scanner scan = new Scanner(new File("./src/prob3.txt"));
        Scanner scan = new Scanner(System.in);

        //int t = scan.nextInt();
        String str = scan.next();
        while(!str.equals("-1")) {
            System.out.println(str + " = " + func(str));
            str = scan.next();
        }
    }

    public static int func(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 20);
        map.put('l', 30);
        map.put('m', 40);
        map.put('n', 50);
        map.put('o', 60);
        map.put('p', 70);
        map.put('q', 80);
        map.put('r', 90);
        map.put('s', 100);
        map.put('t', 200);
        map.put('u', 300);
        map.put('v', 400);
        map.put('w', 500);
        map.put('x', 600);
        map.put('y', 700);
        map.put('z', 800);
        map.put('?', 900);
        map.put('A', 1000);
        map.put('B', 2000);
        map.put('C', 3000);
        map.put('D', 4000);
        map.put('E', 5000);
        map.put('F', 6000);
        map.put('G', 7000);
        map.put('H', 8000);
        map.put('I', 9000);
        map.put('J', 10000);
        map.put('K', 20000);
        map.put('L', 30000);
        map.put('M', 40000);
        map.put('N', 50000);
        map.put('O', 60000);
        map.put('P', 70000);
        map.put('Q', 80000);
        map.put('R', 90000);
        map.put('S', 100000);
        map.put('T', 200000);
        map.put('U', 300000);
        map.put('V', 400000);
        map.put('W', 500000);
        map.put('X', 600000);
        map.put('Y', 700000);
        map.put('Z', 800000);
        map.put('!', 900000);

        int sum = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            sum+=map.get(ch[i]);
        }
        return sum;
    }
}