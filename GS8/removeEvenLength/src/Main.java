import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("Brain");
        set.add("Car");
        set.add("Same");
        set.add("Said");
        set.add("Crane");

        System.out.println(removeEvenLength(set));




    }


    public static Set<String> removeEvenLength(Set<String> set){
        for(Iterator<String> iterator = set.iterator(); iterator.hasNext(); ){
            String word = iterator.next();
            if((word.length() % 2) == 0){
                iterator.remove();
            }
        }


        return set;
    }
}