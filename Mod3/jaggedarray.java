package JavaCourseAKS.Mod3;

import java.util.Scanner;

public class jaggedarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int row = in.nextInt();

        int[][] array = new int[row][];

        for (int i = 0; i < array.length ; i++){
            System.out.print("Enter no of columns for row "+ (i+1)+" : ");
            array[i] = new int[in.nextInt()];

            for (int j = 0 ; j < array[i].length ; j++){
                System.out.print("Enter column data "+j+" : ");
                array[i][j] = in.nextInt();
            }
        }
        System.out.println("Output Array: \n");
        for(int[] i : array){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
