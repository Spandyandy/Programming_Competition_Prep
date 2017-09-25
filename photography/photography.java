import java.util.*;
import java.io.*;

public class photography{
	static int r, l, b, t, rowA, rowB;
	public static void main(String argv[]) throws FileNotFoundException{
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int n = sc.nextInt();
		sc.next();		
		int i = 0;
		while(i < n){
			float a1, a2;
			int y1, x1, y2, x2;
			a1 = sc.nextFloat();
			y1 = sc.nextInt();
			x1 = sc.nextInt();
			a2 = sc.nextFloat();
			y2 = sc.nextInt();
			x2 = sc.nextInt();


			calculateTB(a1, a2);		
			calculateRL(a1, a2);

			System.out.println("Region " + (i+1) + " has " + ((y2-y1-1)*6 + b + t)*((x2-x1-1)*6+l+r) + " square miles.");
			
			i++;
		}
	}

	private static void calculateTB(float a1, float a2){
		rowA = (int)Math.ceil(a1/6);
		b = 7-rowA;
		rowB = (int)Math.ceil(a2/6);
		t = rowB;
	}
	private static void calculateRL(float a1, float a2){
		if(rowA%2 == 0) {
			if(a1%6 != 0){
				r = 7 - (int)(a1 % 6);
			}
			else 
				r = 1;
		}
		else{
			if(a1%6 != 0)
				r = (int) a1 % 6;
			else 
				r = 6;
		}
		if(rowB%2 == 0){
			if(a2%6 != 0)
				l = (int) a2 % 6;
			else
				l = 6;
		}
		else{
			if(a2%6 != 0)
				l = 7 - (int)(a1 % 6);
			else
				l = 1;
		}
	}
}	
