package Assignment5;

import java.io.Serializable;

public class Student implements Serializable {
    String firstName;
    String dateOfBirth;
    Address address;

    public Student(String firstName, String dateOfBirth, String city, String state, int pinCode, String country) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        address = new Address(city, state, pinCode, country);
    }

}