import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Car", 3);
        map.put("Cat", 3);
        map.put("bat", 3);
        map.put("powers", 6);
        map.put("burger", 6);
        map.put("train", 5);
        map.put("brain", 5);

        System.out.println(rarest(map));

    }



    public static int rarest(Map<String, Integer> map){


        if(map.isEmpty()){
            throw new RuntimeException("Map is Empty!");
        }
       ArrayList<Integer> list = new ArrayList<>();
        for(int i : map.values()){
            list.add(i);
        }

        int min = Integer.MAX_VALUE;
        int rarest = 0;

        for(int i : list) {
            int amount = Collections.frequency(list, i);
            if(amount < min){
                min = amount;
                rarest = i;

            }else if(amount == min){
                if(rarest > list.get(i)){
                    rarest = list.get(i);
                }

            }
        }

        return rarest;
    }

}