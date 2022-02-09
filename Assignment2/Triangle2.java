package Assignment2;

public class Triangle2 implements Operations {
    private double height, base, side1, side2;

    Triangle2(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }

    public void parameter() {
        double parameter = base + side1 + side2;
        System.out.println("Parameter of Triangle = " + parameter);
    }

    public void surfaceArea() {

    }

    public void curvedSurfaceArea() {

    }

    public void volume() {

    }
}
