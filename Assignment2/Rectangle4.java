package Assignment2;

public class Rectangle4 implements Operations {
    private double length, width;

    Rectangle4(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public void area() {
        double area = length * width;
        System.out.println("Area of Rectangle = " + area);
    }

    public void parameter() {
        double parameter = 2 * (length + width);
        System.out.println("Parameter of Square = " + parameter);
    }

    public void surfaceArea() {

    }

    public void curvedSurfaceArea() {

    }

    public void volume() {

    }
}
