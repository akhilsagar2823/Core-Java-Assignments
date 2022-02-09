package Assignment2;

public class Cuboid8 implements Operations {
    private double length, height, width;

    Cuboid8(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
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
