import java.util.Comparator;

public class FirstNameComparator implements Comparator<User>{
    @Override
    public int compare(User u1, User u2) {
        return u1.firstName.compareTo(u2.firstName);
    }
}
