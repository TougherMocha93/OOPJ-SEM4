package JavaCourseAKS.Mod3;

public class arraycopier {
    public static void main(String[] args) {
        int[] array1 = {1,2,4,5,6,7};

        int[] array2 = new int[array1.length];

        for(int i=0;i< array1.length;i++) array2[i] = array1[i];

        for(int i :array2){
            System.out.println(i);
        }
    }
}
