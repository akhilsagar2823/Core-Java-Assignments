package Assignment1;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IntInput {
    public static int intInput() throws IOException {
        try {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            sc.close();
            return num;
        } catch (InputMismatchException e) {
            throw new IOException();
        }
    }
}
