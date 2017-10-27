import java.util.*;
import java.io.*;

public class stringcomp{
	static String[] months= {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"};
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		int n  = Integer.parseInt(sc.nextLine());
		while(n-- > 0){
			String first = sc.nextLine().toLowerCase();
			String second = sc.nextLine().toLowerCase();
			System.out.printf("%s %s %s\n", first, result(first,second), second);
		}
	}
	public static String result(String str1, String str2){
		int result = str1.compareTo(str2);
		if(result > 0) return "follows";
		else if(result < 0) return "precedes";
		else return "matches";
	}
}