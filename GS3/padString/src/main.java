public class main {

    public static void main(String[] args){
        int length = 15;
        String word = "train";

        padString(word, length);
    }

    public static void padString(String word, int length){


        for( int i = word.length(); i <= length; i++){

            if(i < length){
                word += " ";
            }

        }
        System.out.print(word);


    }

}
