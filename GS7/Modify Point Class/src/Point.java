public class Point implements Comparable<Point>{

    int x;
    int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public int compareTo(Point o) {
        if (y != o.y) {
            return y - o.y;
        }else {
            return x - o.x;
        }
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }


}
