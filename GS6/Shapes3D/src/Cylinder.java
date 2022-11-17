public class Cylinder extends Spherical{
    double height;
    double radius;
    public Cylinder(double height, double radius){
        super(height, radius);
        this.height = height;
        this.radius = radius;
    }


    public double getSurfaceArea() {
        return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}
