package Assignment2;

public class Sphere5 implements Operations {
    private double radius;

    Sphere5(double radius) {
        this.radius = radius;
    }

    public void area() {
    }

    public void parameter() {

    }

    public void surfaceArea() {
        double surfacearea = 4 * pi * radius * radius;
        System.out.println("Surface area of Sphere = " + surfacearea);
    }

    public void curvedSurfaceArea() {

    }

    public void volume() {
        double volume = (4 / 3) * pi * radius * radius * radius;
        System.out.println("Volume of Sphere = " + volume);

    }

}
