// Read File and separate lines into strings in arraylist
// Separate each line into an arraylist of strings
//Reverse each arraylist of strings
//Reverse each line


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("this.txt");
        Scanner fileSC = new Scanner(file);
        ArrayList<String> lines = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        ArrayList<String> newline = new ArrayList<>();
        while(fileSC.hasNextLine()){
            lines.add(fileSC.nextLine());
        }
        System.out.println("Orignal: " + lines);

        for (String s : lines) {
            Scanner sc = new Scanner(s);
            while(sc.hasNext()){
                words.add(sc.next());
            }
            Collections.reverse(words);
            newline.add(words.toString().replace(",", ""));
            words.clear();
        }

        Collections.reverse(newline);
        System.out.println("Reversed: " + newline);


    }

}
