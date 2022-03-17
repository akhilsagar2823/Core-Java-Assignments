import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;
import java.net.URL;
import Assignment1.*;

public class Assignment1 {
    public static void main(String[] args) {
        aa: while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                char addnew;
                System.out.print("\nDo you want to add new url in file ? [y/n] : ");
                addnew = sc.next().charAt(0);
                if (addnew == 'n' || addnew == 'N') {
                    System.out.println("\nURL List : ");
                    UrlReader.urlOutput();
                    System.out.println("\nWhich url you weant to traverse : ");
                    int urlnum = sc.nextInt();
                    URL traversurl = UrlReader.urlReader(urlnum);
                    TreeMap<String, Integer> wordcount = TraverserUrl.traverse(traversurl);
                    TraverserUrl.wordWriter(wordcount);
                    System.out.println("\nAssignment  done, you can check the file.");
                    sc.close();
                    break aa;
                } else if (addnew == 'y' || addnew == 'Y') {
                    UrlReader.urlInput();
                    System.out.println("New url added to file.");
                    continue aa;
                } else {
                    System.out.println("Invalid Input !! Try Again !!");
                    continue aa;
                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Invalid Input !! Try Again !!\n");
            }
        }
    }
}