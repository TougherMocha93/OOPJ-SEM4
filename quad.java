package JavaCourseAKS;

import java.util.Scanner;

public class quad {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter constant a: ");
            double a = in.nextDouble();
            System.out.println("Enter constant b: ");
            double b = in.nextDouble();
            System.out.println("Enter constant c: ");
            double c = in.nextDouble();

            double r = (b * b) - (4 * a * c);
            double root1 = ((-b + Math.sqrt(r)) / (2 * a));
            double root2 = ((-b - Math.sqrt(r)) / (2 * a));

            System.out.println("Roots are:");
            System.out.println(root1);
            System.out.println(root2);
        }catch (Exception e){
            System.out.println("You BAAKA");
        }

    }
}