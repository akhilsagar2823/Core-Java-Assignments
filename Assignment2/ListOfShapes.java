package Assignment2;

enum Shapes {
    Circle, Triangle, Square, Rectangle, Sphere, Cone, Cube, Cuboid, Cylinder, Exit;
}

public class ListOfShapes {

    public static void display() {
        int i = 1;
        for (Shapes iShapes : Shapes.values()) {
            System.out.println(i + ") " + iShapes);
            i++;
        }
    }

}
