public class main {

    public static void main(String[] args){

        Fib();

    }

    /*
    Loops to 12 and each in iteration it:
    1. prints the sum
    2. sets the sum to the sum of oneBack and twoBack
    3. sets twoBack to oneBack
    4. sets oneBack to sum
    */

    public static void Fib(){
        int sum = 1;
        int oneBack = 1;
        int twoBack = 0;
        for(int i = 1; i <= 12; i++){


            System.out.println(sum);
            sum = twoBack + oneBack;
            twoBack = oneBack;
            oneBack = sum;

        }

    }



}
