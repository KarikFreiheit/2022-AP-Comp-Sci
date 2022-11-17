public class Sphere extends Spherical{
    double radius;
    double height;
    public Sphere(double height, double radius){
        super(height, radius);
        this.height = height;
        this.radius = radius;
    }


    public double getRadius(){
        return height / 2;
    }
    public double getVolume(){
        return (Math.PI * (Math.pow(radius, 3)) * 1.33);
    }

    public double getSurfaceArea(){
        return 4 * (Math.PI * (radius * radius));
    }



}
