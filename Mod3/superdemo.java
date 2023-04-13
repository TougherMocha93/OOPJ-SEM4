package JavaCourseAKS.Mod3;

class superdemo{
    public static void main(String[] a){
        B obj = new B(10);
    }
}

class A{
    A(){
        System.out.println("Constructor A");
    }
    A(int a){
        System.out.println("Para-Constructor A : " + a);
    }
}

class B extends A{
    B(){
        System.out.println("Constructor B");
    }
    B(int a){
        super(10);
        System.out.println("Para-Constructor B adds 10 : " + (a+10));
    }
}