import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        //REMEMBER TO GET INPUT FROM FILE BEFORE SUBMITTING and use strings
        String[] words = new String[]{"Hello, Yes, No, Bus, Apple, Mouse, World"};
        int[] numbers = new int[]{4, 7, 2, 9, 1, 8, 5, 6, 10, 3};
        System.out.println(Arrays.toString(mergeSort(numbers)));

    }


    public static int[] mergeSort(int[] array){
        if (array.length > 1) {
            int[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            int[] right = Arrays.copyOfRange(array, array.length / 2, array.length);


            mergeSort(left);
            mergeSort(right);
        }

        int l = 0;
        int r = 0;


        return array;
    }

}
