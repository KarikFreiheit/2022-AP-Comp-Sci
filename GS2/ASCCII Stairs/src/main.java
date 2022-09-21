public class main {

    public static final int stairs = 10;
    public static void main(String[] args){

        create();

    }
    /*
    1. Put space before stair
    2. Add stair x offset
    3. Add right side
    4.
    */

    //Person:
    //System.out.print("  ◯  \n /|\\ \n / \\ ");
    //Stair:
    //System.out.print("******\n*      \n*      ");


    public static void create(){




        for(int i = (stairs - 1); i >= 0; i--) {
            for (int j = 0; j <= (i - 1); j++) {

                System.out.print("     ");

            }
            System.out.print("  ◯  ******");
            edge(i + 1);


            for (int k = 0; k <= (i - 1); k++) {

                System.out.print("     ");

            }
            System.out.print(" /|\\ *");
            edge(i);



            for (int l = 0; l <= (i - 1); l++) {

                System.out.print("     ");

            }
            System.out.print(" / \\ *");
            edge(i);
        }

        // places bottom

        System.out.print("******");
        for (int i = 0; i <= (stairs - 1); i++) {

                System.out.print("*****");


        }
        System.out.print("*");

    }


    public static void edge(int i){

        for (int h = i;  h <= stairs - 1; h++) {

            System.out.print("     ");

        }
        System.out.println("*");
    }


}
