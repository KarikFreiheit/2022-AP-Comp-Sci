public class Main {
    public static void main(String[] args) {

        System.out.println(isReverse("trains", "sniarT"));

    }



    public static boolean isReverse(String one, String two){
        if(one.length() != two.length()){
            return false;
        }
        one = one.toLowerCase();
        two = two.toLowerCase();
        System.out.println(one + " " + two);
        if((one.length() < 2 & two == one) || (two.length() < 2 & one == two)){
            return true;
        }else if(one.charAt(one.length() - 1) == two.charAt(0)){
            return isReverse(one.substring(0, one.length() - 1), two.substring(1, one.length()));
        }
        return false;


    }
}