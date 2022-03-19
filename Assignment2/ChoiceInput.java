package Assignment2;

import java.util.Scanner;

public class ChoiceInput {

    public static int choiceinput() {
        int choice;
        Scanner sc = new Scanner(System.in);
        try {
            choice = sc.nextInt();
            return choice;
        } catch (Exception e) {
            return 0;
        }
    }
}
