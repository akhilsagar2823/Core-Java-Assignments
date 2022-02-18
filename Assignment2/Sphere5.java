package Assignment2;

import java.util.Scanner;

public class Sphere5 implements Operations {
    private double radius;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter radius of sphere : ");
            radius = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
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
