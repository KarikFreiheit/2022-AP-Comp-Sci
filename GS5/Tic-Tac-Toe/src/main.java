import java.lang.reflect.Array;
import java.util.*;

public class main {

    public static void main(String[] args){

        char[][] realBoard = new char[3][3];
        char player = 'x';
        turn(player, realBoard);

    }
    public static void turn(char p, char[][] realBoard){

        Scanner sc = new Scanner(System.in);
        System.out.println("Player " + p + " is up");
        System.out.println("[0,0][0,1][0,2]\n[1,0][1,1][1,2]\n[2,0][2,1][2,2]");
        System.out.println("Input a number 0-2 to choose the vertical placement!");
        int vert = sc.nextInt();
        System.out.println("Input a number between 0-2 to choose the horizantal placement!");
        int horiz = sc.nextInt();


        play(vert, horiz, p, realBoard);
    }
    public static void play(int a, int b, char p, char[][] realBoard){


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

        turn(p, realBoard);

    }

}
