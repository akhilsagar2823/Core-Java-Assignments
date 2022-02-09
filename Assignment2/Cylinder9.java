package Assignment2;

public class Cylinder9 implements Operations {
    private double radius, height;

    Cylinder9(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
    }

    public void parameter() {

    }

    public void surfaceArea() {
        double surfacearea = 2 * pi * radius * (radius + height);
        System.out.println("Surface area of Cylinder = " + surfacearea);
    }

    public void curvedSurfaceArea() {
        double curvedsurfacearea = 2 * pi * radius * height;
        System.out.println("Curved surface area of Sphere = " + curvedsurfacearea);
    }

    public void volume() {
        double volume = pi * radius * radius * height;
        System.out.println("Volume of Sphere = " + volume);

    }

}
