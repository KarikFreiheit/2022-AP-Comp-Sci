import java.awt.desktop.SystemEventListener;
import java.util.*;
import java.lang.Math;

public class main {

    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("First side length:");
        double a = sc.nextDouble();
        System.out.println("Second side length:");
        double b = sc.nextDouble();
        System.out.println("Third side length:");
        double c = sc.nextDouble();

        solve(a, b, c);

    }
    public static void solve(double a, double b, double c){
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);

        double angleOne = (((b*b) + (c*c)) - (a*a)) / (2*b*c);
        //System.out.println(angleOne);
        System.out.println("Angle 1: " + Math.toDegrees(Math.acos(angleOne)));

        double angleTwo = (((a*a) + (c*c)) - (b*b)) / (2*a*c);
        //System.out.println(angleTwo);
        System.out.println("Angle 2: " + Math.toDegrees(Math.acos(angleTwo)));

        double angleThree = 180 - (Math.toDegrees(Math.acos(angleTwo)) +Math.toDegrees(Math.acos(angleOne)));
        System.out.println("Angle 3: " + angleThree);

    }



}
