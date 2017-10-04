import java.util.*;
import java.io.*;

public class orderedLists{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int m  = sc.nextInt();
		for(int i = 0; i < m; i++){
			int n[] = new int[10];
			for(int j = 0; j < 10; j++){
				n[j] = sc.nextInt();
			}
			if(checkAscending(n))
				System.out.println("List " + (int)(i +1) + " is in ascending order.");
			else if(checkDescending(n))
				System.out.println("List " + (int)(i +1)+ " is in descending order.");
			else
				System.out.println("List " + (int)(i +1) + " is not ordered.");
		}
	}
	public static boolean checkAscending(int[] n){
		for(int i = 1; i < 10; i++){
			if(n[i] <= n[i-1])
				return false;
		}
			return true;
	}
	public static boolean checkDescending(int[] n){
		for(int i = 1; i < 10; i++){
			if(n[i] >= n[i-1])
				return false;
		}

			return true;
	}
}