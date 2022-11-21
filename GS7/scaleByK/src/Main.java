import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    //Reverse the order to be normal again and put it all in a function
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(3);
        list.add(0);
        list.add(-3);
        list.add(6);
        list.add(1);
        System.out.println(list.toString());
        ArrayList<Integer> newList = new ArrayList<Integer>();
        int size = list.size();

        for(int i = 0; i < size; i++){

            //Removes all negatives and zero from list
            if(list.get(i) <= 0){
                list.remove(i);
                size -=1;
            }


            for(int j = 0; j < list.get(i); j++){
                System.out.println(newList.toString());
                newList.add(0, list.get(i));
            }
        }
        System.out.println(newList.toString());

    }
}
