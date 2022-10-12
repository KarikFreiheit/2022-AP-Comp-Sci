import java.util.*;

public class Main {
    public static void main(String[] args) {


        String s = "abcdefghijklmnopqrstuvwxyz";
        subString(s, 5);

    }

    public static void subString(String s, int a) {
        Scanner sc = new Scanner(s);
        int length  = s.length();
        for (int j = 0; j <= (length / a); j++){
            for (int i = 0; i < a; i++) {

                System.out.print(s.charAt(i));


            }
            s = s.substring(a);


            System.out.println();
        }

    }
}