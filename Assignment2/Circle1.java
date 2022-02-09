package Assignment2;

public class Circle1 implements Operations {
    private double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area = pi * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    public void parameter() {
        double parameter = 2 * pi * radius;
        System.out.println("Circumference of Circle = " + parameter);
    }

    public void surfaceArea() {

    }

    public void curvedSurfaceArea() {

    }

    public void volume() {

    }

    public static void main(String[] args) {
        Circle1 c = new Circle1(5.3);
        c.area();
        c.parameter();

    }
}
