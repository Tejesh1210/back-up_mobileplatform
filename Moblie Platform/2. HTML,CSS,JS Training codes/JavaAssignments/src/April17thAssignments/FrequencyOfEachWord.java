package April17thAssignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachWord {

  public static void main(String[] args) {
    String fileName = "your_text_file.txt"; 
    Map<String, Integer> wordCounts = new HashMap<>();

    try (BufferedReader r = new BufferedReader(new FileReader(fileName))) {
      String line;
      while ((line = r.readLine()) != null) {
        
        String[] words = line.toLowerCase().split("\\W+"); 
        for (String word : words) {
          if (word.isEmpty()) {
            continue;
          }
          int c = wordCounts.getOrDefault(word, 0);
          wordCounts.put(word, c + 1);
        }
      }
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }

    
    System.out.println("Word frequencies:");
    for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
