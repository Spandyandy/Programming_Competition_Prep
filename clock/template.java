import java.util.*;
import java.io.*;

public class template{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int T = sc.nextInt();
		for(int i=0; i<T;i++){
			int a  = sc.nextInt();
			int b  = sc.nextInt();
			int c  = sc.nextInt();
			int d  = sc.nextInt();
			int e  = sc.nextInt();
			int f  = sc.nextInt();	
			System.out.println(clock(a,b,c,d,e,f));
		}
	}
	public static String clock(int a, int b, int c, int d, int e, int f){
		int[] arr = {a, b, c, d, e, f};
		Arrays.sort(arr);
		int[] digits = new int[6];
		for(int i = 0; i < 240000; i++){
			digits = getDigits(i);
			if(isValid(digits)){
				int arr2[] = {digits[0],digits[1],digits[2],digits[3],digits[4],digits[5]};
				cdArrays.sort(digits);
				if(Arrays.equals(arr, digits))
					return ""+arr2[0]+arr2[1]+":"+arr2[2]+arr2[3]+":"+arr2[4]+arr2[5];
			}
		}
		return "Not Valid";
	}
	public static int[] getDigits(int num){
		int[] digits = new int[6];
		for(int i = 0; i < 6; i++)
			digits[i] = (num/((int)Math.pow(10,5-i)) % 10);
		return digits;
	}
	public static boolean isValid(int[] arr){
		if(Integer.parseInt(arr[2]+""+arr[3])>=60 || Integer.parseInt(arr[4]+""+arr[5])>=60)
			return false;
		return true;
	} 
}
