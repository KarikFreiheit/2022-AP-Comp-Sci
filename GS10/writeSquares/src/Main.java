public class Main {
    public static void main(String[] args) {
        writeSquares(8);
    }


    public static int writeSquares(int n){

        if(n < 1) {
            return 0;
        }else if( n % 2 == 1){
            System.out.println(n * n);
            writeSquares(n - 1);
        }else {
            writeSquares(n - 1);
            System.out.println(n * n);
        }
        return 0;
    }


}