package Assignment3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class AddDetails {

    public static void addDetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        String name, email, dob, age;
        String arr[] = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
        ArrayList<String> detailslist = new ArrayList<String>();

        aa: while (true) {
            System.out.print("Enter Name : ");
            String temp = sc.nextLine();
            for (String i : arr) {
                if (temp.contains(i)) {
                    System.out.println("Invalid Input !!\nEnter again !!");
                    temp = null;
                    continue aa;
                }
            }
            name = temp.substring(0, 1).toUpperCase() + temp.substring(1).toLowerCase();
            break aa;
        }

        while (true) {

            try {
                System.out.print("\nEnter DOB (in \"dd/mm/yyyy\") : ");
                dob = sc.next();
                Date dOb = new SimpleDateFormat("dd/mm/yyyy").parse(dob);

                break;
            } catch (ParseException e) {
                System.out.println("Invalid Input !!\nEnter again !!");
                dob = null;
                continue;
            }
        }

        System.out.print("\nEnter age : ");
        age = sc.next();

        while (true) {
            System.out.print("\nEnter Email Id : ");
            email = sc.next();
            if (email.contains("@") && email.contains(".")) {
                email = email.toLowerCase();
                break;
            } else {
                System.out.println("Invalid Input !!\nEnter again !!");
                email = null;
                continue;
            }
        }
        detailslist.add(name);
        detailslist.add(dob);
        detailslist.add(age);
        detailslist.add(email);

        FileWriter addemployee = new FileWriter("Assignment3\\Employee.txt", true);
        for (String s : detailslist) {
            addemployee.write(s + ",  ");
        }
        addemployee.write("\n");
        addemployee.close();

    }
}