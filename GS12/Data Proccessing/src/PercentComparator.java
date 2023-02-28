import java.util.Comparator;

public class PercentComparator implements Comparator<User> {
    public int compare(User u1, User u2){
        if(u1.gradePercentage > u2.gradePercentage){
            return 1;
        }else if(u1.gradePercentage == u2.gradePercentage){
            return 0;
        } else{
            return -1;
        }
    }
}
