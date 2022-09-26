public class main {
    public static final int a = 1;
    public static final int b = 10;

    public static void main(String[] args){

        printRange(a, b);

    }

    public static void printRange(int c, int d){
        System.out.print("[");
        if(c > d){

            for(int i = (c - 1); i > d; i--){
                System.out.print(i);
            }

        } else if (c < d) {

            for(int i = (c + 1); i < d; i++){
                System.out.print(i);
            }

        }else{
            System.out.print(c);
        }
        System.out.println("]");

    }


}
