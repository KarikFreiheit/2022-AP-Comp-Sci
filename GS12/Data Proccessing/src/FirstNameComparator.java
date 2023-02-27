import java.util.Comparator;

public class FirstNameComparator implements Comparator<User>{
    @Override
    public int compare(User u1, User u2) {
        if(u1.firstName.charAt(0) > u2.firstName.charAt(0)){
            return 1;
        } else if (u1.firstName.charAt(0) == u2.firstName.charAt(0)) {
            return 0;
        }else{
            return -1;
        }
    }
}
