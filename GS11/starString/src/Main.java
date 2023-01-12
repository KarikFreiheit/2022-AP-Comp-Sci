
public class Main {

    public static void main(String[] args){
        starString(3);
    }
    public static void starString(int power){
        if(power < 0){
            throw new IllegalArgumentException();
        }else if(power == 0){
            System.out.print("*");
        }else if( power > 0){
            starString(power - 1);
            starString(power - 1);
        }


    }

}
