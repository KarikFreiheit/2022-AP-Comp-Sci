import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(22);
        list.add(20);
        list.add(25);
        list.add(25);
        list.add(20);

        System.out.println(maxOccurrences(list));
    }
    public static int maxOccurrences(ArrayList<Integer> list){
        if(list.size() == 0){
            return 0;
        }
        //Finds # of occurrences per item
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }

        //Finds int with most occurrences
        int max = 0;
        for(int i : map.values()){
            if(i > max){
                max = i;
            }
        }
        return max;



    }
}