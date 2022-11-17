import java.math.*;
public class Pyramid extends Polyhedrons{

    double height;
    double length;
    double width;
    public Pyramid(double height, double width, double length){
        super(height, width, length);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getVolume(){
        return (length * width * height) / 3;
    }

    public double getSurfaceArea(){
        return (length * width) + (length * Math.sqrt((width/ 2) * (width/2) + (height * height))) + (width * (Math.sqrt((length / 2) * (length / 2) + (height * height))));
    }

}
