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

        Map<Integer, Integer> map = new HashMap<>();
        for (int i : list) {
            if(map.containsKey(i)){
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i, 1);
            }
        }
        System.out.println(map);
        int max = 0;
        for(int i : map.values()){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);



    }
}