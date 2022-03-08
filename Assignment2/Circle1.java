package Assignment2;

import java.util.Scanner;

public class Circle1 implements Operations {
    private double radius;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter radius of circle : ");
            radius = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
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

}
