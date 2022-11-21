import java.lang.Math;
public class Hexagon implements Shape{
    public double side;
    public Hexagon(double side){
        this.side = side;

    }

    public double getArea(){
        return ((3 * Math.sqrt(3)) / 2) * (side * side);
    }

    public double getPerimeter(){
        return side * 6;
    }
}
