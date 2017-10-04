import java.util.*;
import java.io.*;

public class riverDice{
	public static int count= 0;
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int m  = sc.nextInt();
		for(int i = 0; i < m; i++){
			int n = sc.nextInt();
			int k = sc.nextInt();

			int gcdF = gcd(riverDice(n, k), (int)Math.pow(k, n));


			System.out.println(riverDice(n, k)+"/"+(int)Math.pow(k, n));

		}
	}

	public static int gcd(int a, int b){
		if(a == 0)
			return b;
		return gcd(b%a, a);
	}

	public static int riverDice(int n, int k){
		if(n==0){
			System.out.println("0/1");
			return 1;
		}
		if(n==1){
			return k;
		}
		return riverDice(n-1, serialNum(k, ++count));
	}

	public static int serialNum(int a, int start){
		int num = 0;
		for(int i = start; i <= a; i++){
			num += i;
		}
		return num;
	}
}