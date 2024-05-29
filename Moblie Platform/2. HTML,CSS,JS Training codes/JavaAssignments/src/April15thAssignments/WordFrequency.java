package April15thAssignments;

import java.util.*;

public class WordFrequency {

    public static Map<String, Integer> countWordFrequency(String t) {
      // Create a HashMap to store word frequencies
      Map<String, Integer> wordCount = new HashMap<>();
  
      
      for (String word : t.split(" ")) {
        
        String lowercaseword = word.toLowerCase();
        
        // Check if the word already exists in the map
        if (wordCount.containsKey(lowercaseword)) {
          // Increment the count for existing word
          wordCount.put(lowercaseword, wordCount.get(lowercaseword) + 1);
        } else {
          // Add the word with initial count 1
          wordCount.put(lowercaseword, 1);
        }
      }
      return wordCount;
    }
  
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      String t = scan.nextLine();
      Map<String, Integer> wordFrequency = countWordFrequency(t);
  
      System.out.println("Word frequency:");
      for (String w : wordFrequency.keySet()) {
        System.out.println(w + ": " + wordFrequency.get(w));
      }
    }
  }

