package JavaCourseAKS;

import java.util.Scanner;

public class prg8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i,n=0,sum=0;
        double avg = 0;
        System.out.println("the nos are: ");
        for(i=0;i<5;i++){

            n = in.nextInt();
            sum += n;
        }
        avg = sum/5.0;

        System.out.println("Sum is: "+sum + " Avg is: "+ avg);
    }
}
