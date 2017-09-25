import java.util.*;
import java.io.*;

public class powerfulNum{
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new FileReader("input.txt"));
		long m1 = 1;
		long m2 = 10000000000000L;



/*
		long[] a = new long[200];
		long[] b = new long[200];
		for(int i = 1; i < a.length; i++){
			a[i] = i;
		}
		for(int i = 1; i < b.length; i++){
			b[i] = i;
		}
		List<Long> pn = new ArrayList<>();
		for(int i = 0; i < a.length-1; i++){
			for(int j = 0; j < b.length-1; j++){
				if(!pn.contains(a[i]*a[i]*b[j]*b[j]*b[j])){
					pn.add(a[i]*a[i]*b[j]*b[j]*b[j]);
				}
			}
		}
		Collections.sort(pn);

		for (int i = 0; i < pn.size(); i++) {
			System.out.println(pn.get(i));
		}



		/*
		while(m1 != 0 || m2 != 0){
			m1 = sc.nextInt();
			m2 = sc.nextInt();
			
			
			int d = 0;
			for (int i = 0; i < pn.size(); i++) {
				if(m1 <= pn.get(i) && m2>=pn.get(i)){
					d++;
					System.out.println(pn.get(i));
				}
			}
			System.out.println(d);
		}*/
		int c = 0;
		for(long i = m1; i < m2; i++){
			if(isPowerful(i))
				c++;
		}

 		System.out.println(c);
	}
	public static boolean isPowerful(long n){
	    while (n%2 == 0)
	    {
	        int power = 0;
	        while (n % 2 == 0)
	        {
	            n /= 2;
	            power++;
	        }
	        if (power == 1)
	          return false;
	    }
	    for (int factor=3;  factor<=Math.sqrt(n); factor += 2)
	    {
	        int power = 0;
	        while (n % factor == 0)
	        {
	            n = n/factor;
	            power++;
	        }
	 
	        if (power == 1)
	          return false;
	    }
	    return (n == 1);
	}
	
}