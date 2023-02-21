import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] array = new int[]{10,4,6,3,8,7,2,9,1,5};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(selectionSort(array)));
    }


    public static int[] selectionSort(int[] array){
        int k = array.length;

        for(int i = 0; i < k; i++) {
            int maxindex = 0;
            int max = 0;

            int minindex = 0;
            int min = Integer.MAX_VALUE;

            //For every element that's hasn't already been moved to the end find the max and it's index
            for (int j = 0; j < k - i; j++) {

                if (array[j] > max) {
                    max = array[j];
                    maxindex = j;
                }
                if (array[j] < min && array[j] != max) {
                    min = array[j];
                    minindex = j;
                }


            }



            //Move the new max to the i less than the end then move the replaced element to where the new max was
            int tempmax = array[k - i - 1];

            //if max is already in its spot don't swap it
            if(tempmax != max){
                //System.out.println(tempmax + " " + max);
                array[k - i - 1] = array[maxindex];
                array[maxindex] = tempmax;

            }else{
                System.out.println("Same Max");

            }




            //Move the new min to the i less than the end then move the replaced element to where the new min was
            int tempmin = array[i];

            //if min is already in its spot don't swap it
            if(tempmin != min){

                //System.out.println(tempmin + " " + min);
                array[i] = array[minindex];
                array[minindex] = tempmin;

            }else{
                System.out.println("Same Min");

            }


            System.out.println("Min: " + min + " Min-Index: " + (minindex + 1) + " Min-Index-Placement: " + (i + 1) + " Max: " + max + " Max-Index: " + (maxindex + 1)+ " Max-Index-Placement: " + (k - i));
            System.out.println(Arrays.toString(array) + "\n");


        }

        return array;
    }
}