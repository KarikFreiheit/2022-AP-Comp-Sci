import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please type your full name: ");
        Scanner sc = new Scanner(System.in);
        processName(sc.nextLine());

    }



    public static void processName(String s){
        Scanner sc = new Scanner(s);
        String first = "";

        while(sc.hasNext()){
            String next = sc.next();

            if(!sc.hasNext()) {
                System.out.print(next + ", " + first);
            }else {
                first += next + " ";
            }

        }

    }
}