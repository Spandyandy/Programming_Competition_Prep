import java.util.*;
import java.io.*;

public class cypher{
	static String qwerty = "qwertyuiop[asdfghjkl;zxcvbnm,";
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("inputcypher.txt"));
		int n  = sc.nextInt();
		for(int i = 0; i < n; i++){
			char[] c1 = sc.next().toCharArray();
			char c = c1[0];
			String text = sc.nextLine();
			char[] textarray = text.toCharArray();
			if(c == 'E'){
				encoding(textarray);
			}
			else if(c == 'D'){
				decoding(textarray);
			}
		}
	}


	public static void encoding(char[] text){
		char[] arr =  qwerty.toCharArray();
		for(int i = 1; i < text.length; i++){
			if(text[i] == ' ')
				System.out.print(" ");
			for(int j = 0; j < arr.length; j++){
				if(text[i] == arr[j])
					System.out.print(arr[j+1]);
			}
		}
		System.out.println();
	}
	public static void decoding(char[] text){
		char[] arr =  qwerty.toCharArray();
		for(int i = 1; i < text.length; i++){
			if(text[i] == ' ')
				System.out.print(" ");
			for(int j = 0; j < arr.length; j++){
				if(text[i] == arr[j])
					System.out.print(arr[j-1]);
			}
		}
		System.out.println();
	}
}