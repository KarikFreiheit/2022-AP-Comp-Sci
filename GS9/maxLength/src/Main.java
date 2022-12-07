import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("String");
        set.add("Strings");
        set.add("NO");
        set.add("Nice");
        set.add("So");
        set.add("Yes");
        set.add("Supercalifragilisticexpialidocious");


        System.out.println((maxLength(set)));



    }

    public static int maxLength(Set<String> set){
        if(set.size() == 0){
            return 0;
        }
        String length = "";

        for(String s : set){
            if(s.length() > length.length()){
                length = s;
            }
        }

        return length.length();
    }
}