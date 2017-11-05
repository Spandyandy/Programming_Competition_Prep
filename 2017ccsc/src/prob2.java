import java.util.*;
import java.io.*;

public class prob2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);
//        Scanner scan = new Scanner("2\n" +
//                "12 10 16 18\n" +
//                "11 9 19 17\n" +
//                "13 15 14 8\n" +
//                "22 20 15 11\n" +
//                "12 14 13 21\n" +
//                "19 16 17 18 ");

        int t = scan.nextInt();
        int zz = 0;
        while(t-- != 0) {
            int [] [] input = new int[3][4];
            String [] [] output = new String[3][4];
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j < 4; j++) {
                    input[i][j] = scan.nextInt();
                }
            }
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j < 4; j++) {
                    output[i][j] = findSuccessor(input[i][j], input);
                }
            }
            zz++;
            System.out.println("Successor Matrix " + zz +":");
            for (int i = 0; i <3 ; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.print(output[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    private static String findSuccessor(int i, int[][] arr) {
        for (int j = 0; j <arr.length ; j++) {
            for (int k = 0; k < arr[j].length; k++) {
                if(arr[j][k]  == i+1){
                    int row = k;
                    int col = j;
                    return "(" + col +"," + row +")";
                }
            }
        }
        return "null";
    }


}