public class Main {
    public static void main(String[] args) {
        int n = 50;
        Fibonacci(n, 0,0, 1);
    }
    //Switched to long to increase the number of iterations

    public static long Fibonacci(long n, long inc, long twoBack, long oneBack) {
        if(inc == 0){
            System.out.println(0);
            System.out.println(1);
            inc = 2;
        }
        long newValue = twoBack + oneBack;
        twoBack = oneBack;
        if (inc < n){
            System.out.println(newValue);
            inc += 1;
            return Fibonacci(n, inc, twoBack, newValue);
        }else
        {
            return 0;
        }
    }
}