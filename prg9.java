package JavaCourseAKS;

import java.util.Scanner;

public class prg9 {
    public static void main(String[] args) {
        int i, n,prod = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Input the number: ");
        n = in.nextInt();
        for (i=0;i<=10;i++){
            prod = n *i;
            System.out.println(n+" x "+i+" = "+prod);
        }
    }
}
