import java.util.Comparator;

public class IDComparator implements Comparator<User>{
    @Override
    public int compare(User u1, User u2){
        if(u1.id > u2.id){
            return 1;
        }else if(u1.id == u2.id){
            return 0;
        } else{
            return -1;
        }
    }
}
