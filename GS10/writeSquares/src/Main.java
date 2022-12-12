public class Main {
    public static void main(String[] args) {
        writeSquares(8);
    }


    public static int writeSquares(int n){

            if(n % 2 == 0){
                System.out.print(n*n + ", ");
                return writeSquares(n - 1);
            }else if(n > 1){
                return writeSquares(n - (n - 1));
            }
            else{
                return 0;
            }







    }
}