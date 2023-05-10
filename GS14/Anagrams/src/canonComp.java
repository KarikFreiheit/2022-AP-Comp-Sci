import java.util.Arrays;
import java.util.Comparator;

public class canonComp implements Comparator<String> {

    public static String toCanon(String s){
        char[] c = s.toCharArray();
        s ="";
        Arrays.sort(c);
        for (char cee: c) {
            s += cee;
        }
        return s;
    }

    public int compare(String s1, String s2){

        int compare = toCanon(s1).compareTo(toCanon(s2));

        return compare;
    }
}
