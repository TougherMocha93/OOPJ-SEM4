package JavaCourseAKS;

import java.util.Scanner;

public class prg2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a=");
        double a = in.nextDouble();
        System.out.println("b=");
        double b  = in.nextDouble();
        System.out.println("c=");
        double c = in.nextDouble();
        double result = (b*b) - (4*a*c);

        if(result>0){
            double r1 = -b + Math.pow(result,0.5)/(2.0*a);
            double r2 = -b - Math.pow(result,0.5)/(2.0*a);
            System.out.println("rt1 = "+ r1 + "\nrt2 = "+ r2);
        } else if (result == 0.0) {
            double rt = -b/(2.0*a);
            System.out.println("rt =  "+ rt);
        }
        else
            System.out.println("no real roots exist");
    }
}
