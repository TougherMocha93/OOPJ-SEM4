package JavaCourseAKS.Mod3;

import java.util.Scanner;

public class revstore {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        str.append(in.next());
        str = str.reverse(); //Reverse the string using StringBuilder Class' built-in function
        System.out.println(str);
    }
}
