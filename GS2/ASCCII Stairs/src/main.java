public class main {

    public static final int stairs = 5;

    public static void main(String[] args){

        create();

    }
    /*
    1. Increase width
    2. Add stair x offset
    3. Add right side
    4.
    */

    //Person:
    //System.out.print("  ◯  \n /|\\ \n / \\ ");
    //Stair:
    //System.out.print("******\n*      \n*      ");


    public static void create(){





        for(int j = 1; j<= stairs; j++) {
                System.out.println("  ◯  \n /|\\ \n / \\ ");
                System.out.println("******\n*      \n*      ");
        }

        for(int i = 1; i <= stairs; i++) {
            System.out.print("******");
        }
        System.out.println("**********************************");
    }


}
