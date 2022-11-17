public class Main {

    public static void main(String[] args){
        Pyramid pyramid = new Pyramid(2, 5, 5);
        Sphere sphere = new Sphere(10,5);
        Cylinder cylinder = new Cylinder(2, 5);
        Rectangularprism rectangularprism = new Rectangularprism(2, 4, 4);
        Cone cone = new Cone(2, 5);
        System.out.println("Pyramid Surface Area: " + pyramid.getSurfaceArea());
        System.out.println("Pyramid Volume: " + pyramid.getVolume());
        System.out.println("Sphere Surface Area: " + sphere.getSurfaceArea());
        System.out.println("Sphere Volume: " + sphere.getVolume());
        System.out.println("Cylinder Surface Area: " + cylinder.getSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.getVolume());
        System.out.println("Rectangular Prism Surface Area: " + rectangularprism.getSurfaceArea());
        System.out.println("Rectangular Prism Volume: " + rectangularprism.getVolume());
        System.out.println("Cone Surface Area: " + cone.getSurfaceArea());
        System.out.println("Cone Volume: " + cone.getVolume());
    }
}
