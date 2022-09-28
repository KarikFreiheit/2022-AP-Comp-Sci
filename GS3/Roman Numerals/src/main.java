public class main {


    // I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000


    public static final int a = 2894;
    public static void main(String[] args){
        intNumerals(a);
    }

    public static void intNumerals(int b){

        String romanNumeral = "";
        if( b >= 1000 ){
            int thousands = b / 1000;
            for(int m = 0; m < thousands; m++) {
                romanNumeral += "M";
            }
            b %= 1000;
        }
        if( b >= 900){
            int nineHundred = b / 900;
            for(int cm = 0; cm < nineHundred; cm++) {
                romanNumeral += "CM";
            }
            b %= 900;
        }
        if( b >= 500){
            int fiveHundred = b / 500;
            for(int d = 0; d < fiveHundred; d++) {
                romanNumeral += "D";
            }
            b %= 500;
        }
        if( b == 400){
            int fourHundred = b / 400;
            for(int cd = 0; cd < fourHundred; cd++) {
                romanNumeral += "CD";
            }
            b %= 400;
        }
        if( b >= 100){
            int oneHundred = b / 100;
            for(int c = 0; c < oneHundred; c++) {
                romanNumeral += "C";
            }
            b %= 100;
        }
        if( b >= 90){
            int ninety = b / 90;
            for(int xc = 0; xc < ninety; xc++) {
                romanNumeral += "XC";
            }
            b %= 90;
        }
        if( b >= 50){
            int fifty = b / 50;
            for(int l = 0; l < fifty; l++) {
                romanNumeral += "L";
            }
            b %= 50;
        }
        if( b == 40){
            int forty = b / 40;
            for(int xl = 0; xl < forty; xl++) {
                romanNumeral += "XL";
            }
            b %= 40;
        }
        if( b >= 10){
            int ten = b / 10;
            for(int x = 0; x < ten; x++) {
                romanNumeral += "X";
            }
            b %= 10;
        }
        if( b >= 9){
            int nine = b / 9;
            for(int ix = 0; ix < nine; ix++) {
                romanNumeral += "IX";
            }
            b %= 9;
        }
        if( b >= 5){
            int five = b / 5;
            for(int v = 0; v < five; v++) {
                romanNumeral += "V";
            }
            b %= 5;
        }
        if( b == 4){
            int four = b / 4;
            for(int iv = 0; iv < four; iv++) {
                romanNumeral += "IV";
            }
            b %= 4;
        }
        if( b >= 1){
            int one = b / 1;
            for(int i = 0; i < one; i++) {
                romanNumeral += "I";
            }
            b %= 1;
        }
        System.out.println(romanNumeral);
    }

}
