package JavaCourseAKS;

import java.util.Scanner;

class comparator{
    int compare(char a,char b){
        int at = Integer.parseInt(String.valueOf(a));
        int bt = Integer.parseInt(String.valueOf(b));

        return Math.max(at, bt);
    }

    int compare(String a,String b){
        int at = Integer.parseInt(a);
        int bt = Integer.parseInt(b);

        return Math.max(at, bt);
    }

    int compare(int a,int b){
        return Math.max(a,b);
    }
}

public class prg13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        comparator c = new comparator();

        System.out.println("Using int: "+ c.compare(25,37));
        System.out.println("Using char: "+ c.compare('5','7'));
        System.out.println("Using string: "+ c.compare("5","10"));


    }

}
