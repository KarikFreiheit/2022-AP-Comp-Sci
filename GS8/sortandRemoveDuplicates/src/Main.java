import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(-2);
        list.add(3);

        System.out.println(sortAndRemoveDuplicates(list));
    }


    public static Set<Integer> sortAndRemoveDuplicates(ArrayList<Integer> list){
        Set<Integer> set = new HashSet<>();
        Collections.sort(list);
        for(int i : list){
            set.add(i);
        }
        return set;
    }

}
