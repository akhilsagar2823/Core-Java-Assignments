package Assignment2;

public class Cone6 implements Operations {
    private double radius, height;

    Cone6(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
    }

    public void parameter() {

    }

    public void surfaceArea() {
        double surfacearea = pi * radius * (radius + Math.sqrt(height * height + radius * radius));
        System.out.println("Surface area of Cone = " + surfacearea);
    }

    public void curvedSurfaceArea() {
        double curvedsurfacearea = pi * radius * Math.sqrt(height * height + radius * radius);
        System.out.println("Curved surface area of Cone = " + curvedsurfacearea);
    }

    public void volume() {
        double volume = (1 / 3) * pi * radius * radius * height;
        System.out.println("Volume of Cone = " + volume);

    }
}
