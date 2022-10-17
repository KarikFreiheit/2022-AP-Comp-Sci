import java.util.*;

public class Main {
    public static void main(String[] args) {


        String s = "abcdefghijklmnopqrstuvwxyzd";
        subString(s, 5);

    }

    public static void subString(String s, int a) {


        /* First Attempt - String index out of range
        Scanner sc = new Scanner(s);
        int length  = s.length();
        for (int j = 0; j <= (length / a); j++){
            for (int i = 0; i < a; i++) {


                System.out.print(s.charAt(i));


            }
            s = s.substring(a);


            System.out.println();
        }
        */

        Scanner sc = new Scanner(s);
        int length = s.length();
        String b = s;
        for (int j = 0; j <= s.length() ; j += a){
            if (length < a){
                System.out.print(b + "\n");
                System.out.println();

            }else{
                System.out.print(s.substring(j, a + j) + "\n");
                b = b.substring(b.length() - (length % a));
                length -= a;

            }


        }


    }
}