import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class main{

    public static void main(String[] args) throws FileNotFoundException {

        int wordCount = 0;
        int lineCount = 0;
        Scanner input = new Scanner(new File ("file.txt"));
        while (input.hasNext()){
            String word = input.next();
            wordCount++;
        }
        String[] lines = input.toString().split("\\r\\n|\\r|\\n");
        lineCount = lines.length;
        System.out.print("Number of words: " + wordCount + "\nNumber of lines: " + lineCount);
    }

}
