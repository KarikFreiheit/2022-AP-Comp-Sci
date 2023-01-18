public class Main {
    public static void main(String[] args) {
        writeSequence(4);
    }

    public static void writeSequence(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n >= 3) {
            System.out.print(n - 2 + " ");
            writeSequence(n-1);
            if(n - 2 != 1) {
                System.out.print(n - 2 + " ");
            }
        }
    }
}