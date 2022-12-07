import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(4);
        list.add(5);

        list.add(9);
        int e = 5;
        System.out.print(partition(list, e));

    }



    public static ArrayList<Integer> partition(ArrayList<Integer> list, int e){

        ArrayList<Integer> before = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> after = new ArrayList<>();

        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < e){
               before.add(list.get(i));
            }else if(list.get(i) == e){
                equal.add(list.get(i));
            }
            else{
                after.add(list.get(i));

            }
        }

        list.clear();
        for(int i = 0; i < before.size(); i++){
            list.add(before.get(i));
        }
        for(int i = 0; i < equal.size(); i++){
            list.add(equal.get(i));
        }
        for(int i = 0; i < after.size(); i++){
            list.add(after.get(i));
        }



        return list;
    }



}