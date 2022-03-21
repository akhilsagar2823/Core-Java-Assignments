import java.util.Scanner;

import Assignment4.*;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = null;

        System.out.print("1) Run AccountOverdrawDemo\n2) Run AccountOverdrawSafeDemo\n\nEnter Choice : ");
        choice = sc.next();
        switch (choice) {
            case "1":
                System.out.println(" Runing AccountOverdrawDemo\n");
                AccountOverdrawDemo account = new AccountOverdrawDemo();
                Thread t1 = new Thread(account);
                Thread t2 = new Thread(account);
                t1.setName("Akhilsagar");
                t2.setName("Harsh");
                t1.start();
                t2.start();
                break;

            case "2":
                System.out.println(" Runing AccountOverdrawSafeDemo\n");
                AccountOverdrawSafeDemo safeaccount = new AccountOverdrawSafeDemo();
                Thread t3 = new Thread(safeaccount);
                Thread t4 = new Thread(safeaccount);
                t3.setName("Akhilsagar");
                t4.setName("Harsh");
                t3.start();
                t4.start();
                break;

            default:
                System.out.println("!! Invalid Input !! Try Again !!");
        }
    }
}
