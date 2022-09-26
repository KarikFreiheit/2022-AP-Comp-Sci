public class main {
    public static final int number = 3;
    public static final String string = "hello";

    public static void main(String[] args){

        repl(string, number);

    }

    public static void repl(String string, int number){
        String newString = "";
        for(int i = 0; i < number; i++ ){
            newString += string;
        }
        System.out.println(newString);
    }

}
