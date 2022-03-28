package Assignment5;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    String firstName;
    Date dateOfBirth;
    Address address;

    public Student(String firstName, String dateOfBirth, String city, String state, int pinCode, String country)
            throws ParseException {
        this.firstName = firstName;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth);
        address = new Address(city, state, pinCode, country);
    }

}