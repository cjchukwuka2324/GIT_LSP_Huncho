package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static void main(String[] args) {
        // Provide the path to your text file
        String filePath = "src/org/howard/edu/lsp/assignment2/words.txt";

        try {
            Map<String, Integer> wordCount = countWords(filePath);
            displayWordCount(wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    private static Map<String, Integer> countWords(String filePath) throws IOException {
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");

                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-zA-Z']", ""); // Remove non-alphabetic characters
                    if (word.length() > 3) { // Ignore trivial words
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        }

        return wordCount;
    }

    private static void displayWordCount(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }
    }
}

