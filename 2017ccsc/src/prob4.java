import java.util.*;
import java.io.*;

public class prob4 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();
        double a,b,c,d,e,f;
        int total = t;
        while(t-- != 0) {
            a = scan.nextDouble();
            b = scan.nextDouble();
            c = scan.nextDouble();
            d = scan.nextDouble();
            e = scan.nextDouble();
            f = scan.nextDouble();

            int num = findIntercept(a-d, b-e, c-f);
            if(num ==0){
                System.out.println("Segment "+(total-t)+" is not enclosed");
            }
            else if(num == 1){
                System.out.println("Segment "+(total-t)+" area is 0.000");
            }
            else{
                double[] i = returnIntercept(a-d, b-e, c-f);
                System.out.printf("Segment %d area is %.3f\n",total-t,integrate(i[0], i[1],a-d, b-e, c-f));
            }
        }
    }

    public static  int findIntercept(double a, double b, double c){
        double temp = (b*b)-(4*a*c);
        if(temp < 0){
            return 0;
        }
        else if(temp == 0){
            return 1;
        }
        else return 2;
    }

    public static double[] returnIntercept(double a, double b, double c){
        double[] tmp =  {(-b + Math.sqrt((b*b)-(4*a*c)))/(2*a),(-b - Math.sqrt((b*b)-(4*a*c)))/(2*a)};
        return tmp;
    }

    public static double integrate(double d, double dd, double a, double b, double c){
            return Math.abs((a*Math.pow(d,3)/3  + b*Math.pow(d,2)/2 + c*d)
                    -
                    (a*Math.pow(dd,3)/3  + b*Math.pow(dd,2)/2 + c*(dd)));

    }
    
}