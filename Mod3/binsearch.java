package JavaCourseAKS.Mod3;

import java.util.Arrays;
import java.util.Scanner;

public class binsearch {
    public static void main(String[] args) {
        int[] n = {1,2,3,4,5,6,7,8,9,15};

        for( int i : n){
            System.out.print(i+",");
        }
        System.out.println("\n\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Search Query: ");
        int sr = in.nextInt();

        System.out.println( (Arrays.binarySearch(n,sr) >= 0)? "Key is found" : "Key does not exist in list");
    }
}
