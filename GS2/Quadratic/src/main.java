import java.util.*;
import java.lang.Math.*;
public class main {


    //ax^2 + bx + c = 0


    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("ax^2 + bx + c = 0");
        System.out.println("Input an a value");
        int a = sc.nextInt();
        System.out.println("Input a b value");
        int b = sc.nextInt();
        System.out.println("Input a c value");
        int c = sc.nextInt();
        solve(a, b, c);


    }

    public static void solve(int a, int b, int c){

        b*=-1;
        double answerOne = (b + Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
        double answerTwo = (b - Math.sqrt((b*b) - (4 * a * c))) / (2 * a);
        System.out.println("Roots:");
        System.out.println(answerOne);
        System.out.println(answerTwo);

    }



}
