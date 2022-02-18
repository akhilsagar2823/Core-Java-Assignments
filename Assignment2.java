import java.util.*;
import Assignment2.*;

public class Assignment2 {

    public static void main(String[] args) {
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n");
            ListOfShapes.display();
            System.out.println();
            System.out.print("Enter your choice(in numbers): ");
            choice = ChoiceInput.choiceinput();

            switch (choice) {
                case 1:
                    Circle1 circle = new Circle1();
                    try {
                        circle.input();
                        circle.area();
                        circle.parameter();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 2:
                    Triangle2 triangle = new Triangle2();
                    try {
                        triangle.input();
                        triangle.area();
                        triangle.parameter();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 3:
                    Square3 square = new Square3();
                    try {
                        square.input();
                        square.area();
                        square.parameter();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 4:
                    Rectangle4 rectangle = new Rectangle4();
                    try {
                        rectangle.input();
                        rectangle.area();
                        rectangle.parameter();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 5:
                    Sphere5 sphere = new Sphere5();
                    try {
                        sphere.input();
                        sphere.surfaceArea();
                        sphere.volume();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 6:
                    Cone6 cone = new Cone6();
                    try {
                        cone.input();
                        cone.curvedSurfaceArea();
                        cone.surfaceArea();
                        cone.volume();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 7:
                    Cube7 cube = new Cube7();
                    try {
                        cube.input();
                        cube.parameter();
                        cube.surfaceArea();
                        cube.volume();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 8:
                    Cuboid8 cuboid = new Cuboid8();
                    try {
                        cuboid.input();
                        cuboid.parameter();
                        cuboid.surfaceArea();
                        cuboid.volume();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 9:
                    Cylinder9 cylinder = new Cylinder9();
                    try {
                        cylinder.input();
                        cylinder.curvedSurfaceArea();
                        cylinder.surfaceArea();
                        cylinder.volume();
                    } catch (Exception e) {
                        System.out.println("\nInvalid Input!!!\n");
                    }
                    break;
                case 10:
                    System.out.println("Thankyou for using  :)  ");
                    System.out.println("Exiting!!");
                    break;
                default:
                    System.out.println("\nInvalid Input!!!\n");
            }
        } while (choice != 10);
        sc.close();

    }
}