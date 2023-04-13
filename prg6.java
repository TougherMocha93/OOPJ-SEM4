package JavaCourseAKS;

import java.util.Scanner;

public class prg6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter year");
        int year = in.nextInt();

        //boolean a = (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0);

        if( (year % 100 == 0) ? (year % 400 == 0) : (year % 4 == 0) )
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");

    }
}
