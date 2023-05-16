import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("src\\words"));
        while(sc.hasNextLine()){
            String next = sc.nextLine();
            list.add(next);
        }
        Collections.sort(list, new canonComp());
        System.out.println(list);



    }



}