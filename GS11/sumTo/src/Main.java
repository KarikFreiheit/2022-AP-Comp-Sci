public class Main {
    public static void main(String[] args) {
        System.out.println(sumTo(2));
    }

    public static float sumTo(int n){
        if(n == 0){
            return 0;
        } else if (n < 0) {
            throw new IllegalArgumentException();
        }else {
            return sumTo(n - 1) + 1.0f / n;
        }




    }
}