import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        isUnique(map);
        map.put("one", "car");
        map.put("two", "truck");
        map.put("three", "semi");
        map.put("four", "truck");

        System.out.println(isUnique(map));

    }


    public static Boolean isUnique(Map<String, String> map){

        Collection<String> values = map.values();
        Set<String> valueSet = new HashSet<>();
        for(String value : values){
            valueSet.add(value);
        }
        if(valueSet.size() == map.size()){
            return false;
        }else{
            return true;
        }

    }
}