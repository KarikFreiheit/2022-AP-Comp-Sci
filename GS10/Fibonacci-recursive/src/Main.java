public class Main {
    public static void main(String[] args) {
        int n = 6;
        int value = 1;
        int oneBack = 1;
        int twoBack = 0;
        for(int i = 1; i < n; i++){


            System.out.println(value);
            value = twoBack + oneBack;
            twoBack = oneBack;
            oneBack = value;

        }
        System.out.println(Fibonacci(n));
    }


    public static long Fibonacci(long n) {
       if( n <= 1){
           return n;
       }else{
           return Fibonacci(n - 1) + Fibonacci(n - 2);
       }
    }


}