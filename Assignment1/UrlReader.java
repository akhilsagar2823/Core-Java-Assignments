package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlReader {
    public static void urlInput() throws IOException {
        UrlReader writer = new UrlReader();
        writer.input();
    }

    public void input() throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            BufferedWriter urlwriter = new BufferedWriter(
                    new FileWriter("D:\\Internship\\P2 - Java Core\\Assignment\\Assignment1\\urls.txt", true));
            System.out.print("Enter the URL : ");
            String newurl = sc.next();
            try {
                URL url = new URL(newurl);
                urlwriter.write(newurl + "\n");
                urlwriter.flush();
                break;
            } catch (MalformedURLException e) {
                System.out.println("Invalid url !! Try Again !!");
                throw new IOException();

            }
        }
    }

    public static URL urlReader(int urlnum) throws IOException {
        try {
            BufferedReader urlreader = new BufferedReader(
                    new FileReader("D:\\Internship\\P2 - Java Core\\Assignment\\Assignment1\\urls.txt"));
            for (int i = 1; i < urlnum; i++) {
                if (urlreader.readLine() == null) {
                    throw new IOException();
                }
            }
            String newurl = urlreader.readLine();
            URL url = new URL(newurl);
            return url;
        } catch (Exception e) {
            throw new IOException(); // for main
        }

    }

    public static void urlOutput() throws IOException {
        BufferedReader urlreader = new BufferedReader(
                new FileReader("D:\\Internship\\P2 - Java Core\\Assignment\\Assignment1\\urls.txt"));
        int n = 1;
        String url;
        while ((url = urlreader.readLine()) != null) {
            System.out.println(n + ") " + url);
            n++;
        }
    }

}
