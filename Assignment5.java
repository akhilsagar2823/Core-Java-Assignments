import Assignment5.DeserializationTest;

public class Assignment5 {
    public static void main(String[] args) {
        // SerializationTest.Serializing();
        // System.out.println("Done!!!");
        /*
         * Serialized Student class objects in
         * output1.ser(dateOfBirth is String) and
         * output2.ser(dateOfBirth is Date)
         */

        System.out.println("Deserializing \"output1.ser\" : \n");
        DeserializationTest.Deserialize1();
        System.out.println("\nDeserialization done !!\n");

        System.out.println("Deserializing \"output2.ser\" : \n");
        DeserializationTest.Deserialize2();
        System.out.println("\nDeserialization done !!\n");
    }
}