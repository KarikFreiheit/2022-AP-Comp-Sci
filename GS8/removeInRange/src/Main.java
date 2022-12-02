import javax.swing.text.Element;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        LinkedList<Integer> ints = new LinkedList<>();
        ints.add(3); ints.add(7);ints.add(3);ints.add(5);ints.add(4);ints.add(3);ints.add(2);ints.add(8);ints.add(1);ints.add(7);ints.add(4);ints.add(3);
        int min = 1;
        int max = 7;
        int value = 3;
        System.out.println(removeInRange(ints, value, min, max));
    }

    public static LinkedList<Integer> removeInRange(LinkedList<Integer> list, int value, int min, int max){
        for(int i = min; i < max; i++){
            if(list.get(i) == 3){
                list.remove(i);
            }
        }
        return list;
    }

}
