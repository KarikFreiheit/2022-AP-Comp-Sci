import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(4);
        list.add(9);
        list.add(9);
        list.add(9);

        list.add(6);
        list.add(8);
        list.add(2);


        System.out.print(countUnique(list));
    }



    public static int countUnique(ArrayList<Integer> list){
        Set<Integer> set = new HashSet<>();

        for(int i : list){
            set.add(i);
            if(Collections.frequency(list, i) > 1){
                set.remove(i);
            }
        }

        System.out.println(set);
        return set.size();
    }
}