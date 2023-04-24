package JavaCourseAKS.Mod4;

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
        super(); //Already Exists without declaration as the constructor of the Parent is by default executed first before it comes to the constructor of the child class
        System.out.println("_______child initiated________");
    }

    Child(int a){
        System.out.println("_______para-child initiated at "+a+" ________");
    }

    Child(int a,int b){
        super(b); //Here, we are overriding the default super() in order to execute the modified-parametric constructor that we defined in the Parent class
        System.out.println("_______para-child initiated at "+a+" ________");
    }

    void Called(){
        super.Called();
        System.out.println("Child Called");

    }
}