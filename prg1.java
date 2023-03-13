package JavaCourseAKS;

import java.util.Scanner;

public class prg1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int input = in.nextInt();
        if(input>0)
            System.out.println("Number is positive");
        else if(input<0)
            System.out.println("Number is negative");
        else
            System.out.println("Number is zero");

    }
}
