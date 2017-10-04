import java.util.*;
import java.io.*;

public class zellers{
	static String[] months= {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int n  = sc.nextInt();
		for(int i = 0; i < n; i++){
			String monthstr = sc.next().toLowerCase();
			String daystr = sc.next();
			int day = Integer.parseInt(daystr.substring(0,daystr.length()-1));
			int year = Integer.parseInt(sc.next());
			
			int month = 1;
			for(int j =0; j < 12; j++){
				if(monthstr.equals(months[j]))
					 month = j+1;			
			}
			calculate(month, day, year);
		}
		
	}
	public static void calculate(int m, int d, int y){
		if(m == 1){
			m = 13;
			y -= 1;
		}
		if(m == 2){
			m = 14;
			y -= 1;
		}
		int J = y / 100;
		int K = y % 100;
		int h = (d+26*(m+1)/10+K+K/4+J/4+5*J)%7;
		String[] l = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		
		if(m == 13){
			m = 1;
			y += 1;
		}
		if(m == 14){
			m = 2;
			y += 1;
		}
		System.out.println(l[h] + ", " + months[m-1].toUpperCase().charAt(0)+ months[m-1].substring(1,months[m-1].length()) + " " + d + ", " + y);
	}
}