import java.lang.reflect.Array;
import java.util.*;

public class main {

    public static void main(String[] args){
        Random rand = new Random();
        int[] randomNumbers = new int[4];
        int[] inputNumbers = new int[4];
        int length = inputNumbers.length;


        //Randomizes the numbers
        for(int i = 0; i < length; i++){
           randomNumbers[i] = rand.nextInt(10);
        }
        //System.out.println(Arrays.toString(randomNumbers));
        randomNumbers = new int[] {6, 6, 8, 4};

        input(length, randomNumbers, inputNumbers);


    }
    public static void input(int length, int[] randomNumbers, int[] inputNumbers){
        Scanner sc = new Scanner(System.in);

        //Records your guess and fills its own array
        System.out.println("Please input your guess one number at a time.");
        for( int i = 0; i < length; i++){
            System.out.println("Guess " + (i + 1) + ": ");
            inputNumbers[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(inputNumbers));

        check(length, randomNumbers, inputNumbers);

    }

    public static void check(int length, int[]randomNumbers, int[]inputNumbers){
        int digitCorrect = 0;
        int bothCorrect = 0;

        for(int i = 0; i < length; i++){
            //Gets number correct and in the right place

            if(inputNumbers[i] == randomNumbers[i]){
                bothCorrect++;

                continue;
            }

            //Gets number correct

            for(int j = i; j < length; j++) {


                if (inputNumbers[i] == randomNumbers[j]) {
                    digitCorrect++;
                    break;

                }

            }


        }



        if(bothCorrect > 0 && bothCorrect != 4){
            System.out.println("You got " + bothCorrect + " correct and in the right place!");
        }
        else if(bothCorrect == 0){
            System.out.println("You got 0 correct and in the right place.");
        }else if (bothCorrect == 4){
            System.out.println("You got the correct guess and won!");
            System.exit(0);
        }
        if(digitCorrect > 0){
            System.out.println("You got " + digitCorrect + " correct but in the wrong place!");
        }else {
            System.out.println("You got 0 correct and in the wrong place.");
        }

        input(length, randomNumbers, inputNumbers);


    }

}
