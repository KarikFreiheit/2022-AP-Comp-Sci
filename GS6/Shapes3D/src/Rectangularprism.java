public class Rectangularprism extends Polyhedrons{

    double height;
    double length;
    double width;

    public Rectangularprism (double height, double length, double width){
        super(height, width, length);
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public double getVolume(){
        return length * width * height;

    }


    public double getSurfaceArea() {
        return (length * width * 2) + (width * height * 2) + (length * height * 2);
    }
}
