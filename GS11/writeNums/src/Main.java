public class Main {
    public static void main(String[] args) {
        writeNums(50);
    }

    public static void writeNums(int n){
        if(n == 1){
            System.out.print("1, ");
        }
        if (n > 1) {
            writeNums(n-1);
            System.out.print(n + ", ");
        }


    }
}