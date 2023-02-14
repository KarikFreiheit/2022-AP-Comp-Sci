import java.awt.*;
import java.util.Comparator;

public class pointComparator implements Comparator<Point> {
    //Compares distance from origin

    public int compare(Point p1, Point p2){
        double distp1 = Math.sqrt(((0 - p1.x) * (0 - p1.x)) + ((0 - p1.y) * (0 - p1.y)));
        double distp2 = Math.sqrt(((0 - p2.x) * (0 - p2.x)) + ((0 - p2.y) * (0 - p2.y)));
        if(distp1 > distp2){
            return 1;
        }else if (distp1 == distp2){
            return 0;
        }else{
            return -1;
        }
    }


}
