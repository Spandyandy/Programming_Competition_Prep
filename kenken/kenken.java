import java.util.*;
import java.io.*;

public class kenken{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int m  = sc.nextInt();
		for(int i = 0; i < m; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(fact(k)*un1(n,k,c));
		}
		
	}
	public static int un1(int n, int k, int c, int begin){
		int[] arr = new int[c*c];
		int total = 0;
		for(int i = 1; i < c+1; i++){
			un1(n)
				if(i+j == n)
					total++;
		}
		return total;
	}

	public static int fact(int n){
		int total = 1;
		for(int i = 1; i <= n; i++)
			total *= i;
		return total;
	}
}