import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("words.txt"));
        String[] words = new String[9995]; // Number of words in words.txt
        int i = 0;
        while(sc.hasNext()) {
            words[i] = sc.nextLine();
            i++;
        }
        System.out.println("Unsorted: " + Arrays.toString(words));

        mergeSort(words);
        System.out.println("Sorted: " + Arrays.toString(words));

    }


    public static void mergeSort(String[] array){
        if (array.length > 1) {
            String[] left = Arrays.copyOfRange(array, 0, array.length / 2);
            String[] right = Arrays.copyOfRange(array, array.length / 2, array.length);


            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);

        }

    }

    public static void merge(String[] result, String[] left, String[] right){
        int i1 = 0;
        int i2 = 0;
        for(int i = 0; i < result.length; i++){
            if(i2 >= right.length || (i1 < left.length && left[i1].charAt(0) <= right[i2].charAt(0)) ){
                result[i] = left[i1];
                i1++;
            }else{
                result[i] = right[i2];
                i2++;
            }
        }

    }


}
