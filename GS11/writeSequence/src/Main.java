public class Main {
    public static void main(String[] args) {
        writeSequence(10);
    }
    public static void writeSequence(int n){
        if(n % 2 == 0){
            writeSequenceEven(n / 2);
        }else{
            writeSequenceOdd((n + 1) / 2);
        }
    }
    public static void writeSequenceOdd(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n >= 0 && n != 1) {
            System.out.print(n + " ");
            writeSequenceOdd(n-1);
            System.out.print(n + " ");
        } else if (n == 1) {
            System.out.print(n + " ");

        }
    }
    public static void writeSequenceEven(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n >= 0 && n != 1) {
            System.out.print(n + " ");
            writeSequenceEven(n-1);
            System.out.print(n + " ");
        } else if (n == 1) {
            System.out.print(n + " ");
            System.out.print(n + " ");

        }
    }
}