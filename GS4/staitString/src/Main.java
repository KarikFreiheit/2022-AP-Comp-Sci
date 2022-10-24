import java.util.*;

public class Main {
    public static void main(String[] args) {


        String s = "this is a string";
        int a = 5;

        stairString(s, a);


    }


    //Get number of words in string
    //separate those words into number of lines indicated by a
    //Output in stair problem
    public static void stairString(String s, int a){

        Scanner sc = new Scanner(s);
        int length = s.length();
        int b = s.length();

        for (int j = (length / a); j >= 0; j--){
            if(s.length() > (length / a)) {
                s = s.substring(j*a,j * (length / a));
                System.out.print(s + "\n");

            }else{
                System.out.print(s);
            }






        }






        /* Attempt #1 
        Scanner sc = new Scanner(s);
        int wordCount = 0;
        int length;
        String dist  = "";

        while(sc.hasNext()){
            String next = sc.next();
            System.out.println(next);
            length = next.length();

            for(int i = 0; i <= length; i++){

                dist += " ";
            }
            System.out.print(dist);
            wordCount++;
        }


        //lines = a + (wordCount % a);
        System.out.println(wordCount);
        */



    }
}