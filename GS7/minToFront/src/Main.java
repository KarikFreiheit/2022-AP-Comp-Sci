import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(9);
        list.add(6);
        minToFront(list);
    }
    public static void minToFront(ArrayList<Integer> list){
        int min = list.get(0);

        for(int i = 0; i < list.size(); i++){
            if (min >= list.get(i)){
                min = list.get(i);
            }
        }
        list.remove(list.indexOf(min));
        list.add(0, min);
        System.out.println("Min: " + min + "\nNew List: " + list.toString());
    }
}
