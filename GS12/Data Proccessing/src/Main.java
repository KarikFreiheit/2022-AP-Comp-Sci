import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("Users.txt"));
        int length = 0;
        while(sc.hasNextLine()) {
            sc.nextLine();
            length++;
        }
        Scanner ussc = new Scanner(new File("Users.txt"));
        User[] users = new User[length];

        for(int i = 0; i < length; i++){
            String[] array = ussc.nextLine().split(" ");
            System.out.println(Arrays.toString(array));
            User user = new User(array[0], array[1], Integer.valueOf(array[2]), Float.valueOf(array[3]), array[4].charAt(0));
            users[i] = user;
        }
        System.out.println("Before: ");
        for(int i = 0; i < length; i++){
            System.out.println(users[i].getUser());
        }
        Arrays.sort(users, new FirstNameComparator());
        System.out.println("After: ");

        for(int i = 0; i < length; i++){
            System.out.println(users[i].getUser());
        }



    }
}