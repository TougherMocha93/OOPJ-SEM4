package JavaCourseAKS;

import java.util.Scanner;

public class prg3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a=");
        int a = in.nextInt();
        System.out.println("b=");
        int b = in.nextInt();
        System.out.println("c=");
        int c = in.nextInt();
        int fin = 0;
        if(a>b){
            if(a>c)
                fin = a;
            else
                fin = c;
        }
        else
        {
            if(b>c)
                fin = b;
            else
                fin = c;
        }

        System.out.println("Greatest is: "+fin);
    }
}
