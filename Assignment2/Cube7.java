package Assignment2;

import java.util.Scanner;

public class Cube7 implements Operations {
    private double edege;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter edege of cube : ");
            edege = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public void area() {
    }

    public void parameter() {
        double parameter = 12 * edege;
        System.out.println("Parmeter of Cube = " + parameter);
    }

    public void surfaceArea() {
        double surfacearea = 6 * edege * edege;
        System.out.println("Surface area of Cube = " + surfacearea);
    }

    public void curvedSurfaceArea() {

    }

    public void volume() {
        double volume = edege * edege * edege;
        System.out.println("Volume of Cube = " + volume);

    }
}
