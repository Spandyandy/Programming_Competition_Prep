import java.util.*;
import java.io.*;

public class goodOrEvil{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int m  = sc.nextInt();
		for(int i = 0; i < m; i++){
			char[] ch = sc.next().toCharArray();
			int countG = 0;
			int countE = 0;
			for(int j = 0; j < ch.length; j++){
				if(ch[j] == 'g' || ch[j] == 'G')
					countG++;
				else if(ch[j] == 'e' || ch[j] == 'E')
					countE++;
			}
			if(countG > countE){
				System.out.println("Good");
			}
			if(countG < countE){
				System.out.println("Evil");
			}
			else
				System.out.println("Neutral");

		}
	}
}