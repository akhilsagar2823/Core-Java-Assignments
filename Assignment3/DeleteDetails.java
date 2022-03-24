package Assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeleteDetails {
    public static void deleteDetails() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter name of employee : ");
        String delete = sc.next();
        BufferedReader readfile = new BufferedReader(new FileReader("Assignment3\\Employee.txt"));
        String str;
        boolean notfound = true;
        List<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        while ((str = readfile.readLine()) != null) {
            boolean found = false;
            String[] details = str.split(",  ");
            if (details[0].contains(delete)) {
                System.out.println(str);
                found = true;
                notfound = false;
            }
            ArrayList<String> detail = new ArrayList<>();
            for (String temp : details) {
                detail.add(temp);
            }
            if (found == false) {
                list.add(detail);
            }
        }

        if (notfound == true) {
            System.out.println("\nSorry we do not found any employee with this Information\n");
        } else {
            System.out.println("Deleting these details !! ");
            BufferedWriter write = new BufferedWriter(new FileWriter("Assignment3\\Employee.txt"));
            for (ArrayList<String> l : list) {
                for (String s : l) {
                    write.write(s + ",  ");
                }
                write.newLine();
            }
            write.flush();
        }

    }
}
