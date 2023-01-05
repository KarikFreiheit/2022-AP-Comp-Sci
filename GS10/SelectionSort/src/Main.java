import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;

public class Main {

    public static void main(String[] args){
        int[] array = new int[]{10,4,6,3,8,7,2,9,1,5};
        System.out.println(Arrays.toString(selectionSort(array)));
    }


    public static int[] selectionSort(int[] array){
        int k = array.length;

        for(int i = 0; i < k; i++) {
            int index = 0;
            int max = 0;

            //For every element that's hasn't already been moved to the end find the max and it's index
            for (int j = 0; j < k - i; j++) {
                if (array[j] > max) {
                    max = array[j];
                    index = j;
                }

            }

            //Move the new max to the i less than the end then move the replaced element to where the new max was
            int temp = array[k - i - 1];
            System.out.println(temp + " " + max);
            array[k - i - 1] = array[index];
            array[index] = temp;

        }

        return array;
    }
}
