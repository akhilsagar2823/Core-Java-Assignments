package Assignment2;

import java.util.Scanner;

public class Cylinder9 implements Operations {
    private double radius, height;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter radius of cylinder : ");
            radius = sc.nextDouble();
            System.out.println();
            System.out.print("\nEnter height of cylinder : ");
            height = sc.nextDouble();
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
        double surfacearea = 2 * pi * radius * (radius + height);
        System.out.println("Surface area of Cylinder = " + surfacearea);
    }

    public void curvedSurfaceArea() {
        double curvedsurfacearea = 2 * pi * radius * height;
        System.out.println("Curved surface area of Sphere = " + curvedsurfacearea);
    }

    public void volume() {
        double volume = pi * radius * radius * height;
        System.out.println("Volume of Sphere = " + volume);

    }

}
