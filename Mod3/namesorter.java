package JavaCourseAKS.Mod3;

import java.util.Arrays;
import java.util.Scanner;

public class namesorter {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of names: ");
        int no = in.nextInt();
        String[] names = new String[no];

        for(int i=0;i< names.length;i++){
            System.out.print("Enter name "+(i+1)+" : ");
            names[i] = in.next();
        }
        Arrays.sort(names);

        System.out.println("\nSorted list is: ");
        for (String n : names) {
            System.out.println(n);
        }

    }
}