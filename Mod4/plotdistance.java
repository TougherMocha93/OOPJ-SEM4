package JavaCourseAKS.Mod4;

import java.util.Scanner;

public class plotdistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two sets of coordinates x1,y1,x2,y2 respectively: ");
        point p = new point();
        p.x1 = in.nextDouble();
        p.x2 = in.nextDouble();
        p.y1 = in.nextDouble();
        p.y2 = in.nextDouble();

        System.out.println("Distance is: " + p.distance());
    }
}

class point{
    double x1,x2,y1,y2;

    double distance(){
        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }
}
