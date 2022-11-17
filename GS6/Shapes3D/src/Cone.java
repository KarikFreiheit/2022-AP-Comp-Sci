public class Cone extends Spherical{

    double height;
    double radius;
    public Cone(double height,double radius){
        super(height, radius);
        this.height = height;
        this.radius = radius;
    }


    public double getSurfaceArea() {
        return (Math.PI * radius) * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }


    public double getVolume(){
        return Math.PI * Math.pow(radius, 2) * (height / 3);
    }
}
