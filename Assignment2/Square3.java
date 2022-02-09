package Assignment2;

public class Square3 implements Operations {
    private double side;

    Square3(double side) {
        this.side = side;
    }

    public void area() {
        double area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public void parameter() {
        double parameter = 4 * side;
        System.out.println("Parameter of Square = " + parameter);
    }

    public void surfaceArea() {

    }

    public void curvedSurfaceArea() {

    }

    public void volume() {

    }
}
