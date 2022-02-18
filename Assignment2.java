import java.util.*;
import Assignment2.*;

public class Assignment2 {
    public static void main(String[] args) {
        int choice = 0;// temp;
        Scanner sc = new Scanner(System.in);
        // do {

        try {
            do {
                choice = 0;
                ListOfShapes.display();
                System.out.println();
                System.out.print("Enter your choice(in numbers): ");
                choice = sc.nextInt();
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
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;
                    case 10:
                        System.out.println("Exiting!!");
                        break;
                    default:
                        System.out.println("\nInvalid Input!!!\n");
                }
            } while (choice != 10);
        } catch (Exception e) {
            System.out.println(choice);
            System.out.println("\nInvalid Input!!!\n");
        }
        // temp = choice;
        // } while (temp != 10);
        sc.close();

    }
}