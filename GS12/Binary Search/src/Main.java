import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner filesc = new Scanner(new File("file.txt"));
        Scanner inputsc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(filesc.hasNextLine()){
            list.add(filesc.nextLine());
        }
        System.out.println("Input two words one at a time. Press Enter after each entry.");
        System.out.println(between(inputsc.nextLine(), inputsc.nextLine(), list));
    }

    public static int between(String one, String two, ArrayList<String> list){
        int indexOne = Collections.binarySearch(list, one);
        int indexTwo = Collections.binarySearch(list, two);s

        //Returns 0 if none in between
        if(Math.abs(indexOne - indexTwo) - 1 > 0){
            return Math.abs(indexOne - indexTwo) - 1;
        }else{
            return 0;
        }
    }
}