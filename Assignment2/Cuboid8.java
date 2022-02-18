package Assignment2;

import java.util.Scanner;

public class Cuboid8 implements Operations {
    private double length, height, width;
    private Scanner sc = new Scanner(System.in);

    public void input() {
        try {
            System.out.print("\nEnter length of cuboid : ");
            length = sc.nextDouble();
            System.out.println();
            System.out.print("\nEnter width of cuboid : ");
            width = sc.nextDouble();
            System.out.println();
            System.out.print("\nEnter height of cuboid : ");
            height = sc.nextDouble();
            System.out.println();
        } catch (Exception e) {
            throw new ArithmeticException();
        }
    }

    public void area() {
    }

    public void parameter() {
        double parameter = 4 * (length + height + width);
        System.out.println("Parmeter of Cuboid = " + parameter);
    }

    public void surfaceArea() {
        double surfacearea = 2 * (length * width + length * height + width * height);
        System.out.println("Surface area of Cuboid = " + surfacearea);
    }

    public void curvedSurfaceArea() {

    }

    public void volume() {
        double volume = length * width * height;
        System.out.println("Volume of Cuboid = " + volume);

    }
}
