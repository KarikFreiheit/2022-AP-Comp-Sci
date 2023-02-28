import java.util.Comparator;

public class LastNameComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2){
        if(u1.lastName.charAt(0) > u2.lastName.charAt(0)){
            return 1;
        } else if (u1.lastName.charAt(0) == u2.lastName.charAt(0)) {
            return 0;
        }else{
            return -1;
        }
    }
}
