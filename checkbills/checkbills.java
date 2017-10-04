import java.util.*;
import java.io.*;

public class checkbills{
	public static void main(String argv[]) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int n = sc.nextInt();
		int i = 0;
		String number;
		while(i < n){
			number = sc.next();
			System.out.print(number+":");			

			
			if(solid(number)){
				System.out.println("solid");
			}
			else if(ladderUp(number) || ladderDown(number)){
				System.out.println("ladder");
			}
			else if(low(number)){
				System.out.println("low");
			}
			else if(high(number)){
				System.out.println("high");
			}
			else if(radar(number)){
				System.out.println("radar");
			}
			else if(repeater(number)){
				System.out.println("repeater");
			}
			else if(seveninrow(number)){
				System.out.println("seven in a row");
			}
			else if(sevenofkind(number)){
				System.out.println("seven of a kind");
			}
			else 
				System.out.println("no pattern");

			i++;
		}
	}

	public static boolean ladderUp(String number){
		char[] charnum = number.toCharArray();
		for(int i = 1; i < 8; i++){
			if(charnum[i] != charnum[i-1]-1){
				return false;
			}
		}
		return true;
	}
	public static boolean ladderDown(String number){
		char[] charnum = number.toCharArray();
		for(int i = 1; i < 8; i++){
			if(charnum[i] != charnum[i-1]+1){
				return false;
			}
		}
		return true;
	}


	public static boolean solid(String number){
		char[] charnum = number.toCharArray();
		for(int i = 1; i < 8; i++){
			if(charnum[i] != charnum[0]){
				return false;
			}
		}
		return true;
	}

	public static boolean seveninrow(String number){
		char[] charnum = number.toCharArray();
		int n = 0;
		for(int i = 1; i < 8; i++){
			if(charnum[i] == charnum[i-1]){
				n++;
			}
		}
		if(n==6)
			return true;
		else
			return false;
	}
	public static boolean sevenofkind(String number){
		char[] charnum = number.toCharArray();
		int f = charnum[0];
		int s = charnum[1];
		int n = 0;
		int n2 = 0;
		for(int i = 0; i < 8; i++){
			if(charnum[i] == f){
				n++;
			}
		}
		for(int i = 0; i < 8; i++){
			if(charnum[i] == s){
				n2++;
			}
		}
		if(n==7 || n2 ==7)
			return true;
		else
			return false;
	}
	public static boolean repeater(String number){
		char[] charnum = number.toCharArray();
		int n = 0;
		for(int i = 0; i < 4; i++){
			if(charnum[i] == charnum[4+i])
				n++;
		}
		if(n==4)
			return true;
		else
			return false;
	}
	public static boolean radar(String number){
		char[] charnum = number.toCharArray();
		int n = 0;
		for(int i = 0; i < 4; i++){
			if(charnum[i] == charnum[7-i])
				n++;
		}
		if(n==4)
			return true;
		else
			return false;

	}
	public static boolean low(String number){
		int n = Integer.parseInt(number);
		if (n <= 100)
			return true;
		else 
			return false;
	}
	public static boolean high(String number){
		int n = Integer.parseInt(number);
		if (n >= 99999900)
			return true;
		else 
			return false;
	}
}