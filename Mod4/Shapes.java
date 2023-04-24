class Shape {
    double length;
    double width;

    Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    Shape() {
        this.length = 0;
        this.width = 0;
    }

    double calculate() {
        return length * width;
    }
}

class Test1 extends Shape {
    double height;

    Test1(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    Test1() {
        super();
        this.height = 0;
    }

    double calculate() {
        return length * width * height;
    }
}

public class Shapes{
    public static void main(String[] args) {

    }
}