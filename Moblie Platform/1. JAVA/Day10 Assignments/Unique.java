package April15thAssignments;
import java.util.*;

import java.util.Set;
import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String t = scan.nextLine();
            // Split the text into words
            String[] words = t.split("\\s+");

            // Create a Set to store unique words
            Set<String> uniqueWords = new HashSet<>();

            // Add words to the set
            for (String w : words) {
                uniqueWords.add(w);
            }

            // Print the number of unique words
            System.out.println("Number of unique words: " + uniqueWords.size());
        }
    }
}