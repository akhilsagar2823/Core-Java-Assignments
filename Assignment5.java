import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Assignment5.*;

public class Assignment5 {
    public static void main(String[] args) {
        SerializationTest.Serializing();
        System.out.println("Done!!!");
    }
}

class SerializationTest {

    public static void Serializing() {
        try {
            Student student1 = new Student("Akhilsagar", "28/02/2003", "Indore", "M.P.", 452015, "India");
            Student student2 = new Student("Harsh", "04/09/2002", "Indore", "M.P.", 452005, "India");
            Student student3 = new Student("Abhay", "18/08/2002", "Kangra", "H.P.", 176001, "India");
            Student student4 = new Student("Sneha", "10/12/2004", "Kolkata", "W.B.", 700011, "India");

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Assignment5\\outpur1.ser"));
            oos.writeObject(student1);
            oos.writeObject(student2);
            oos.writeObject(student3);
            oos.writeObject(student4);

        } catch (IOException e) {
            System.out.println("Error occured !!");
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
