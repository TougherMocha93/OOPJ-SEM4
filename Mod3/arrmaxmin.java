package JavaCourseAKS.Mod3;

import java.util.Arrays;
import java.util.Scanner;

public class arrmaxmin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] nums = new Integer[n];
        for(int i=0;i<n;i++) nums[i] = in.nextInt();

        Arrays.sort(nums);

        System.out.println("Min: "+nums[0]);
        System.out.println("Max: "+nums[n-1]);
    }
}
