import java.util.Comparator;

public class LastNameComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        return u1.lastName.compareTo(u2.lastName);

    }
}
