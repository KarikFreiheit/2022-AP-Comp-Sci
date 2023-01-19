public class Main {
    public static void main(String[] args) {
        writeSequence(5);
    }

    public static void writeSequence(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n >= 1 && n % 2 == 0) {
            System.out.print(n + " ");
            writeSequence(n-1);
            if(n != 1) {
                System.out.print(n + " ");
            }
        }else if (n >= 3){
            System.out.print(n - 2 + " ");
            writeSequence(n-1);
            if(n != 1) {
                System.out.print(n - 2 + " ");
            }
        }
    }
}