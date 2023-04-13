package JavaCourseAKS;

import java.util.Scanner;

public class prg5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first floating number: ");
        double a = in.nextDouble();
        System.out.println("Enter second floating number");
        double b = in.nextDouble();

        if( Math.round(a*1000) == Math.round(b*1000))
            System.out.println("The numbers are same up to three decimals");
        else
            System.out.println("The numbers are different");
    }
}
