package Assignment5;

import java.io.Serializable;

public class Address implements Serializable {
    String city, state, country;
    int pinCode;

    public Address(String city, String state, int pinCode, String country) {
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
        this.country = country;
    }
}
