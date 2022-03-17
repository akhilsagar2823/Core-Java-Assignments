package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.TreeMap;

public class TraverserUrl {
    public static TreeMap<String, Integer> traverse(URL url) throws IOException {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String words[] = WordsCount.inputWords();
            String urlline;
            int[] countword = { 0, 0, 0 };
            while ((urlline = in.readLine()) != null) {
                countword = WordsCount.wordsCount(urlline, words, countword);
            }
            TreeMap<String, Integer> wordcount = new TreeMap<String, Integer>();
            for (int i = 0; i < 3; i++) {
                wordcount.put(words[i], countword[i]);
            }
            return wordcount;
        } catch (Exception e) {
            throw new IOException();
        }
    }

    public static void wordWriter(TreeMap<String, Integer> wordcount) throws IOException {
        try {
            BufferedWriter wri = new BufferedWriter(
                    new FileWriter("D:\\Internship\\P2 - Java Core\\Assignment\\Assignment1\\words.txt"));
            Iterator itr = (Iterator) wordcount.comparator();
            while (itr.hasNext()) {
                wri.write((String) itr.next());
            }
            wri.flush();
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException();
        }
    }
}
