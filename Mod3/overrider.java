package JavaCourseAKS.Mod3;

public class overrider {
    public static void main(String[] args){
        Child obj = new Child();
        obj.Called();
        for( String i : args){
            System.out.println(i);
        }
    }
}

class Parent{

    Parent(){
        System.out.println("_______parent initiated________");
    }

    Parent(int a){
        System.out.println("_______para-parent initiated at "+a+" ________");
    }

    void Called(){
        System.out.println("Parent Called");
    }

}

class Child extends Parent{

    Child(){
        super();
        System.out.println("_______child initiated________");
    }

    Child(int a){
        System.out.println("_______para-child initiated at "+a+" ________");
    }

    Child(int a,int b){
        super(b);
        System.out.println("_______para-child initiated at "+a+" ________");
    }

    void Called(){
        super.Called();
        System.out.println("Child Called");

    }
}