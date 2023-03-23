
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Wordsearch {

    public static void main(String[] args) {
        String filename = "wordlist.txt"; 
        String[] words = readWordsFromFile(filename); 
        Arrays.sort(words); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word to search: ");
        String searchWord = scanner.nextLine().toLowerCase();
        int index = Arrays.binarySearch(words, searchWord); 
        if (index >= 0) {
            System.out.println("The word '" + searchWord + "' was found in the list.");
        } else {
            System.out.println("The word '" + searchWord + "' was not found in the list.");
        }
    }

    public static String[] readWordsFromFile(String filename) {
        String[] words = null;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            if (line != null) {
                words = line.split(","); 
                for (int i = 0; i < words.length; i++) {
                    words[i] = words[i].trim().toLowerCase(); 
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return words;
    }
}