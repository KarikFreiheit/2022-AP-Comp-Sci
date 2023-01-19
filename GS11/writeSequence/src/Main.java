public class Main {
    public static void main(String[] args) {
        writeSequence(8);
    }

    public static void writeSequence(int n){
        if(n < 1){
            throw new IllegalArgumentException();
        }
        if (n >= 0) {
            System.out.print(n + " ");
            writeSequence(n-1);
            if(n != 1) {
                System.out.print(n + " ");
            }
        }
    }
}