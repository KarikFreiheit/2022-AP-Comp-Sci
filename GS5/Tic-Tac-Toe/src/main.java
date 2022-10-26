import java.lang.reflect.Array;
import java.util.*;

public class main {

    public static void main(String[] args){

        char[][] realBoard = new char[3][3];
        char player = 'x';
        turn(player, realBoard);

    }

    //Gets player inputs
    public static void turn(char p, char[][] realBoard){

        Scanner sc = new Scanner(System.in);

        System.out.println("Player " + p + " is up");
        System.out.println("[0,0][0,1][0,2]\n[1,0][1,1][1,2]\n[2,0][2,1][2,2]");
        System.out.println("Input a number 0-2 to choose the vertical placement!");
        int vert = sc.nextInt();
        if(vert != 1 && vert != 0 && vert != 2){
            System.out.println("Invalid Input");
            System.out.println("Please input a number 0-2 to choose the vertical placement!");
            vert = sc.nextInt();
        }
        System.out.println("Input a number between 0-2 to choose the horizontal placement!");
        int horiz = sc.nextInt();
        if(horiz != 1 && horiz != 0 && horiz != 2){
            System.out.println("Invalid Input");
            System.out.println("Please input a number 0-2 to choose the horizontal placement!");
            horiz= sc.nextInt();
        }
        System.out.println("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r");


        play(vert, horiz, p, realBoard);
    }

    //Applies Player Inputs and shows their turn
    public static void play(int a, int b, char p, char[][] realBoard){
        Scanner sc = new Scanner(System.in);

        if(realBoard[a][b] == 'x' || realBoard[a][b] == 'o'){
            System.out.println("\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r");
            System.out.println("[" + realBoard[0][0] + "]" + "[" + realBoard[0][1] + "]" + "[" + realBoard[0][2] + "]");
            System.out.println("[" + realBoard[1][0] + "]" + "[" + realBoard[1][1] + "]" + "[" + realBoard[1][2] + "]");
            System.out.println("[" + realBoard[2][0] + "]" + "[" + realBoard[2][1] + "]" + "[" + realBoard[2][2] + "]");
            System.out.println("This space is already taken! Please Input a new value.");
            System.out.println("[0,0][0,1][0,2]\n[1,0][1,1][1,2]\n[2,0][2,1][2,2]");
            System.out.println("Input a number 0-2 to choose the vertical placement!");
            a = sc.nextInt();
            System.out.println("Input a number between 0-2 to choose the horizontal placement!");
            b = sc.nextInt();
        }

        if(p == 'x'){
            realBoard[a][b] = 'x';
            p = 'o';
        }else if(p == 'o'){
            realBoard[a][b] = 'o';
            p = 'x';
        }


        System.out.println("The updated board after your turn:");
        System.out.println("[" + realBoard[0][0] + "]" + "[" + realBoard[0][1] + "]" + "[" + realBoard[0][2] + "]");
        System.out.println("[" + realBoard[1][0] + "]" + "[" + realBoard[1][1] + "]" + "[" + realBoard[1][2] + "]");
        System.out.println("[" + realBoard[2][0] + "]" + "[" + realBoard[2][1] + "]" + "[" + realBoard[2][2] + "]");
        if(check(realBoard) == 'x'){
            System.out.println("x is the winner!");
        }else if(check(realBoard) == 'o') {
            System.out.println("o is the winner!");
        }else{
            turn(p, realBoard);
        }



    }


//Checks if a player has one the game after their turn
    public static char check(char[][] realBoard){

        if(realBoard[0][0] == 'x' && realBoard[0][1] =='x' && realBoard[0][2] == 'x'){
           return 'x';
        }
        if(realBoard[1][0] == 'x' && realBoard[1][1] =='x' && realBoard[1][2] == 'x'){
            return 'x';
        }
        if(realBoard[2][0] == 'x' && realBoard[2][1] =='x' && realBoard[2][2] == 'x'){
            return 'x';
        }
        if(realBoard[0][1] == 'x' && realBoard[1][1] =='x' && realBoard[2][1] == 'x'){
            return 'x';
        }
        if(realBoard[0][2] == 'x' && realBoard[1][2] =='x' && realBoard[2][2] == 'x'){
            return 'x';
        }
        if(realBoard[0][0] == 'x' && realBoard[1][0] =='x' && realBoard[2][0] == 'x'){
            return 'x';
        }
        if(realBoard[0][0] == 'x' && realBoard[1][1] =='x' && realBoard[2][2] == 'x'){
            return 'x';
        }
        if(realBoard[0][2] == 'x' && realBoard[1][1] =='x' && realBoard[2][0] == 'x'){
            return 'x';
        }
        if(realBoard[0][0] == 'o' && realBoard[0][1] =='o' && realBoard[0][2] == 'o'){
            return 'o';
        }
        if(realBoard[1][0] == 'o' && realBoard[1][1] =='o' && realBoard[1][2] == 'o'){
            return 'o';
        }
        if(realBoard[2][0] == 'o' && realBoard[2][1] =='o' && realBoard[2][2] == 'o'){
            return 'o';
        }
        if(realBoard[0][1] == 'o' && realBoard[1][1] =='o' && realBoard[2][1] == 'o'){
            return 'o';
        }
        if(realBoard[0][2] == 'o' && realBoard[1][2] =='o' && realBoard[2][2] == 'o'){
            return 'o';
        }
        if(realBoard[0][0] == 'o' && realBoard[1][0] =='o' && realBoard[2][0] == 'o'){
            return 'o';
        }
        if(realBoard[0][0] == 'o' && realBoard[1][1] =='o' && realBoard[2][2] == 'o'){
            return 'o';
        }
        if(realBoard[0][2] == 'o' && realBoard[1][1] =='o' && realBoard[2][0] == 'o'){
            return 'o';
        }

        return 'p';
    }

}
