public class Main {
    public static void main(String[] args) {
        System.out.print(fib(5));
    }

    public static int fib(int n){

        if( n <= 2 ){
            return 1;
        }else{
            return fib(n) + helper();
        }
    }

    public static int helper(int twoBack, int oneBack){
        return twoBack + oneBack;
    }

}