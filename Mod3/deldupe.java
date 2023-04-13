package JavaCourseAKS.Mod3;

import java.util.Arrays;
import java.util.Scanner;

public class deldupe {

    public static void main(String[] args) {
        int[] array = new int[5];
        Scanner in = new Scanner(System.in);

        for(int i=0;i<5;i++){
            array[i] = in.nextInt();
        }

        Arrays.sort(array);

        for(int i=1;i<5;i++){
            if(array[i-1] == array[i]) array[i] = 0;
            Arrays.sort(array);
        }

        for(int i=0;i<5;i++){
            System.out.print( (array[i] != 0)? array[i] + "\n": "");
        }
    }
}
