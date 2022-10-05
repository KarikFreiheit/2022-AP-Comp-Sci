import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main{

    public static void main(String[] args) throws FileNotFoundException {

        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;
        File f = new File ("file.txt");

        Scanner inputLines = new Scanner(f);

        while(inputLines.hasNextLine()){
            lineCount++;
            inputLines.nextLine();
        }


        Scanner inputWords = new Scanner(f);


        while (inputWords.hasNext()){

            String word = inputWords.next();
            wordCount++;
        }

        Scanner inputChars = new Scanner(f);

        while (inputChars.hasNext()){
            String l = inputChars.nextLine();
            charCount += l.length();
        }





        System.out.print("Number of words: " + wordCount + "\nNumber of lines: " + lineCount + "\nNUmber of Chars: " + charCount);
    }

}
