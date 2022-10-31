import java.util.*;

public class main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String alph = "abcdefghijklmnopqrstuvwxyz";
        String word = "tetris";
        int wrong = 0;
        System.out.println("Have someone else choose a word and let them input it below.");
        word = sc.nextLine();
        char[] wordArray = new char[word.length()];
        char[] guessArray = new char[word.length()];
        for(int i = 0; i < word.length(); i++){
            wordArray[i] = word.charAt(i);
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Guess the word by guessing letters one at a time!");
        input(alph, guessArray, wordArray, wrong);

    }
    public static void input(String alph, char[] guessArray, char[] wordArray, int wrong){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a lowercase letter!");
        char inputChar = sc.next().charAt(0);
        check(inputChar, alph, guessArray, wordArray, wrong);
    }
    public static void check(char c, String alph, char[] guessArray, char[] wordArray, int wrong){
        boolean correct = false;
        for(int i = 0; i < wordArray.length; i++){
            if(c == wordArray[i]){
                guessArray[i] = c;
                correct = true;
            }
        }
        if(correct == false){
            wrong++;
            hangman(c, alph, guessArray, wordArray, wrong);
        }else{
            correct(c, alph, guessArray, wordArray, wrong);
        }

    }

    public static void hangman(char c, String alph, char[] guessArray, char[] wordArray, int wrong){
        System.out.println("You had an incorrect guess.");

        if(wrong == 1){
            System.out.println(
                        "      +---+\n" +
                        "      |   |\n" +
                        "      |   o\n" +
                        "      |\n" +
                        "      |\n" +
                        "      |\n" +
                        "=========");
        }
        if(wrong == 2){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |   |\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
        }
        if(wrong == 3){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |  /|\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
        }
        if(wrong == 4){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |  /|\\\n" +
                            "      |\n" +
                            "      |\n" +
                            "=========");
        }
        if(wrong == 5){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |  /|\\\n" +
                            "      |   |\n" +
                            "      |\n" +
                            "=========");
        }
        if(wrong == 6){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |  /|\\\n" +
                            "      |   |\n" +
                            "      |  /\n" +
                            "=========");
        }
        if(wrong == 7){
            System.out.println(
                    "      +---+\n" +
                            "      |   |\n" +
                            "      |   o\n" +
                            "      |  /|\\\n" +
                            "      |   |\n" +
                            "      |  / \\\n" +
                            "=========");
        }
        if(wrong < 7) {

            input(alph, guessArray, wordArray, wrong);
            alph = "abcdefghijklmnopqrstuvwxyz";
            alph.replace(c, ' ');
            System.out.println("Letters remaining. \n" + alph);
        }else{
            System.out.println("Game Over. You Lose");
        }


    }

    public static void correct(char c, String alph, char[] guessArray, char[] wordArray, int wrong){
        System.out.println("You had a correct guess!");
        alph = alph.replace(c, '_');
        System.out.println("Letters remaining: \n" + alph);
        System.out.println(Arrays.toString(guessArray));
        for( int i = 0; i < guessArray.length; i++){
            if(guessArray[i] != wordArray[i]){
                break;
            }else if (i == guessArray.length - 1){
                System.out.println("You win!");
                System.exit(0);
            }
        }
        input(alph, guessArray, wordArray, wrong);



    }

}
