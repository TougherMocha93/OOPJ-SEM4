package JavaCourseAKS;

import java.util.Scanner;

public class prg10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        System.out.println("Input: ");
        n = in.nextInt();;

        for(i=1;i<=n;i++){
            for(j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println(i);
        }
    }
}
