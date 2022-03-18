package Assignment1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;
import java.util.TreeMap;

public class TraverserUrl {
    public static TreeMap<String, Integer> traverse(URL url) throws IOException {
        try {
            var in = new BufferedReader(new InputStreamReader(url.openStream()));
            String words[] = WordsCount.inputWords();
            String urlline;
            int[] countword = { 0, 0, 0 };
            while ((urlline = in.readLine()) != null) {
                // System.out.println(urlline);
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
                    new FileWriter("Assignment1\\words.txt"));
            for (Map.Entry entry : wordcount.entrySet()) {
                wri.write(entry.getKey() + " = " + entry.getValue());
                wri.write("\n");
                wri.flush();
            }
        } catch (Exception e) {
            throw new IOException();
        }
    }
}
