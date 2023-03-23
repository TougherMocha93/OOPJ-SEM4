package JavaCourseAKS.Mod3;

import java.util.Arrays;

public class intarrtostring {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6,7,8,9,0};

        String str = Arrays.toString(array1);

        StringBuilder str2 = new StringBuilder();

        for ( int i = 0; i < array1.length; i++) {
            str2.insert(i,array1[i]); //Change offset value to 0 to print in reverse, as the insert position stays constant at the front of the string
        }

        System.out.println("Method 1: " + str + "\n\nMethod 2: " + str2);
    }
}
