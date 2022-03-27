package Assignment3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SortDetails {

    public static void sorting(int sortchoice) throws IOException {
        ArrayList<String> disarrange = new ArrayList<>();
        ArrayList<String> arrange = new ArrayList<>();
        List<ArrayList<String>> filedata = new ArrayList<>();
        List<ArrayList<String>> sorted = new ArrayList<>();

        BufferedReader readfile = new BufferedReader(new FileReader("Assignment3\\Employee.txt"));
        String str;
        while ((str = readfile.readLine()) != null) {
            ArrayList<String> info = new ArrayList<>();
            String[] details = str.split(",  ");
            for (String in : details) {
                info.add(in);
            }
            filedata.add(info);
        }
        for (int i = 0; i < filedata.size(); i++) {
            disarrange = filedata.get(i);
            arrange.add(disarrange.get(sortchoice));
        }
        ArrayList<String> sorte = new ArrayList<>();
        TreeSet<String> arrangeSet = new TreeSet<String>(arrange);
        for (String s : arrangeSet) {
            for (int i = 0; i < filedata.size(); i++) {
                sorte = filedata.get(i);
                if (sorte.contains(s)) {
                    sorted.add(sorte);
                }
            }
        }
        BufferedWriter write = new BufferedWriter(new FileWriter("Assignment3\\Employee.txt"));
        for (ArrayList<String> l : sorted) {
            for (String s : l) {
                write.write(s + ",  ");
            }
            write.newLine();
        }
        write.flush();
    }
}