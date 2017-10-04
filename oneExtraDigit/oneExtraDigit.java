import java.util.*;
import java.io.*;

public class oneExtraDigit{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int m  = sc.nextInt();
		for(int i = 0; i < m; i++){
			int n =  sc.nextInt();
			calc(n);
		}
	}

	public static void calc (int x){
		for(int i = 10; i <= 99; i++){
			for(int j = 0; j <= 9; j++){
				char[] ch = String.valueOf(i).toCharArray();
				String str1 = String.valueOf(j) + ch[0] + ch[1]; 
				String str2 = ch[0] + String.valueOf(j) + ch[1]; 
				String str3 = ch[0] + "" + ch[1] + String.valueOf(j); 

				int number1 = Integer.parseInt(str1);
				int number2 = Integer.parseInt(str2);
				int number3 = Integer.parseInt(str3);

				//System.out.println(number3 + " " + i + " " + x);

				if(number1 - i == x){
					System.out.println(number1 + " - " + i + " = " + x);
				}
				if(number2 - i == x){
					System.out.println(number2 + " - " + i + " = " + x);
				}
				if(number3 - i == x){
					System.out.println(number3 + " - " + i + " = " + x);
				}
			}	
		}
	}
}