package JavaCourseAKS.Mod3;

public class testing {

    testing(int a){
        System.out.println("contructor activated");
    }

    testing(int a,int b){
        System.out.println("const 2");
    }

    testing(int a,int b,int c){
        System.out.println("const 3");
    }


    public static void main(String[] args) {
        testing obj = new testing(5,6);
    }
}
