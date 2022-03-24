package Assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchDetails {
    public static void searchdetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter any Detail of Employee (Ex : age,name,etc.) : ");
        String search = sc.next();
        BufferedReader readfile = new BufferedReader(new FileReader("Assignment3\\Employee.txt"));
        String str;
        boolean notfound = false;

        while ((str = readfile.readLine()) != null) {
            String[] details = str.split(",  ");
            for (String in : details) {
                if (search.equals(in)) {
                    System.out.println(str);
                    notfound = true;
                }
            }
        }
        if (notfound == false) {
            System.out.println("\nSorry we do not found any employee with this Information\n");
        } else {
            System.out.println("These details are found.");
        }

    }
}
