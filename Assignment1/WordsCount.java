package Assignment1;

import java.util.Scanner;

public class WordsCount {
    String word1, word2, word3;

    public static String[] inputWords() {
        String[] words = new String[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter words you want to count : ");
        System.out.print("Word 1 : ");
        words[0] = sc.next();
        System.out.print("Word 2 : ");
        words[1] = sc.next();
        System.out.print("Word 3 : ");
        words[2] = sc.next();
        return words;
    }

    public static int[] wordsCount(String urlline, String[] words, int[] countword) {
        String[] split = urlline.split(" ");
        for (int i = 0; i < split.length; i++) {
            if (words[0].equals(split[i])) {
                countword[0]++;
            }
            if (words[1].equals(split[i])) {
                countword[1]++;
            }
            if (words[2].equals(split[i])) {
                countword[2]++;
            }
        }
        return countword;
    }

}
