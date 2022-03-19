package Assignment2;

import java.util.Scanner;

public class Rectangle4 implements Operations {
    private double length, width;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter length of rectangle : ");
            length = sc.nextDouble();
            System.out.println();
            System.out.print("\nEnter width of rectangle : ");
            width = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
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
