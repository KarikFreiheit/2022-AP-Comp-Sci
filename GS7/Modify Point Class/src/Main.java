import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Point> points = new ArrayList<Point>();
        points.add(new Point(5, 3));
        points.add(new Point(4, 4));
        points.add(new Point(5, 2));
        points.add(new Point(6, 1));
        points.add(new Point(1, 3));

        System.out.println("Unsorted: " + points.toString());
        Collections.sort(points);
        System.out.println("Sorted: " + points.toString());
    }
}
