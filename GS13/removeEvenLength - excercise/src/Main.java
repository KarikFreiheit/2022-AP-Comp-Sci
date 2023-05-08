import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("car");
        list.add("train");
        list.add("wrap");
        list.add("star");
        removeEvenLength(list);
    }
    public static void removeEvenLength(ArrayList<String> list){
        ArrayList<String> list2 = new ArrayList<>();
        for(String s : list){
            if(s.length() % 2 != 0){
                list.add(s);
            }
        }
        System.out.println(list2);
    }
}