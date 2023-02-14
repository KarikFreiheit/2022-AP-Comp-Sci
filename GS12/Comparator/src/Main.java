import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Point[] points = {
                new Point(5, 4),
                new Point(9, 11),
                new Point(-5, 4),
                new Point(5, -4),
                new Point(52, 4)
        };

        Arrays.sort(points, new pointComparator());
        System.out.println(Arrays.toString(points));


    }
}