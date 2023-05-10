import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(new File("src\\words"));
        while(sc.hasNextLine()){
            String next = sc.nextLine();
            //map.put(next,toCanon(next));
            list.add(next);
        }
        System.out.println(list);
        Collections.sort(list, new canonComp());
        System.out.println(list);



    }



}