package Assignment2;

import java.util.Scanner;

public class Cone6 implements Operations {
    private double radius, height;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter radius of cone : ");
            radius = sc.nextDouble();
            System.out.println();
            System.out.print("\nEnter height of cone : ");
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
        double surfacearea = pi * radius * (radius + Math.sqrt(height * height + radius * radius));
        System.out.println("Surface area of Cone = " + surfacearea);
    }

    public void curvedSurfaceArea() {
        double curvedsurfacearea = pi * radius * Math.sqrt(height * height + radius * radius);
        System.out.println("Curved surface area of Cone = " + curvedsurfacearea);
    }

    public void volume() {
        double volume = (1 / 3) * pi * radius * radius * height;
        System.out.println("Volume of Cone = " + volume);

    }
}
