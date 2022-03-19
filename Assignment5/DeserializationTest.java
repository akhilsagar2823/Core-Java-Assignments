package Assignment5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static void Deserialize1() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Assignment5\\output1.ser"));

            for (int i = 0; i < 4; i++) {
                Student student = (Student) ois.readObject();
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception Occured !!\n");
            System.out.println(e);
        }
    }

    public static void Deserialize2() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Assignment5\\output2.ser"));

            for (int i = 0; i < 4; i++) {
                Student student = (Student) ois.readObject();
                System.out.println(student);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception Occured !!");
        }
    }
}