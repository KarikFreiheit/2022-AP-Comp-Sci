// Read File and separate lines into strings in arraylist
// Separate each line into an arraylist of strings
//Reverse each arraylist of strings
//Reverse each line


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {

        Scanner fileSC = new Scanner(new File("C:\\Users\\steel\\Desktop\\AP Comp Sci\\GS7\\ReverseWordsandLines\\src\\this.txt"));
        ArrayList<String> lines = new ArrayList<>();
        while(fileSC.hasNextLine()){
            lines.add(fileSC.nextLine());
        }

        System.out.println(lines);


    }

}
