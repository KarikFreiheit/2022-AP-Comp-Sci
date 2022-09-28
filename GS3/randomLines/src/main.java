import java.util.Random;

public class main {
    public static void main(String[] args){

        randomLines();

    }


    public static void randomLines(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random r = new Random();
        int d =  r.nextInt(5) + 5;
        for( int i = 0; i <= d; i++){
            String rand = "";
            int p =  r.nextInt(80);
            for( int j = 0; j <= p; j++){
                rand += alphabet.charAt(r.nextInt(26));
            }
            System.out.println(rand);
        }




    }


}
