import java.io.IOException;
import java.util.Scanner;

import Assignment3.*;

public class Assignment3 {
    public static void main(String[] args) {
        boolean whilebreak = true;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1) Add\n2) Search\n3) Sort\n4) Delete\n5) Exit");
            System.out.print("\nEnter your Choice: ");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    try {
                        AddDetails.addDetails();
                        System.out.println("Addition Sucessful !!");
                    } catch (IOException e) {
                        System.out.println("Some Error Occured !! ");
                    }
                    break;
                case "2":
                    try {
                        SearchDetails.searchdetails();
                    } catch (IOException e) {
                        System.out.println(e);
                        System.out.println("Some Error Occured !! ");
                    }
                    break;
                case "3":
                    try {
                        System.out.print("\nSort by :\n\t1) Name\n\t2)Age\nEnter your choice : ");
                        String sortchoice = sc.next();
                        switch (sortchoice) {
                            case "1":
                                SortDetails.sorting(0);
                                System.out.println("Sorted by name you can check the file !!");
                                break;
                            case "2":
                                SortDetails.sorting(Integer.parseInt(sortchoice));
                                System.out.println("Sorted by age you can check the file !!");
                                break;
                            default:
                                System.out.println("Invalid Input !!");
                                break;
                        }
                    } catch (IOException e) {
                        System.out.println("Some Error Occured !! ");
                    }
                    break;
                case "4":
                    try {
                        DeleteDetails.deleteDetails();
                    } catch (IOException e) {
                        System.out.println("Some Error Occured !! ");
                    }
                    break;
                case "5":
                    System.out.println("Exiting !! \n");
                    whilebreak = false;
                    break;
                default:
                    System.out.println("Invalid Input !!");

            }

        } while (whilebreak);
    }
}