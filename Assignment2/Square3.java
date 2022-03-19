package Assignment2;

import java.util.Scanner;

public class Square3 implements Operations {
    private double side;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter side of square : ");
            side = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
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
