package Assignment2;

public class Triangle2 implements Operations {
    private double height, base, side2, side3;

    public void input() {
        height = 0;
        try {
            System.out.print("\nEnter height of triangle : ");
            height = sc.nextDouble();
            System.out.print("\nEnter base(side1) of triangle : ");
            base = sc.nextDouble();
            System.out.print("\nEnter side2 of triangle : ");
            side2 = sc.nextDouble();
            System.out.print("\nEnter side3 of triangle : ");
            side3 = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }

    public void parameter() {
        double parameter = base + side2 + side3;
        System.out.println("Parameter of Triangle = " + parameter);
    }

    public void surfaceArea() {

    }

    public void curvedSurfaceArea() {

    }

    public void volume() {

    }
}
