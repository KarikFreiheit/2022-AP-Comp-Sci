public class main {

    public static void main(String[] args){

        String reverse = "Reverse this string!";

        printReverse(reverse);
    }

    public static void printReverse(String unReversed){
        String reversed = "";
        for( int i = 1; i <= unReversed.length(); i++){
           reversed += unReversed.charAt(unReversed.length() - i);
        }
        System.out.print(reversed);


    }

}
