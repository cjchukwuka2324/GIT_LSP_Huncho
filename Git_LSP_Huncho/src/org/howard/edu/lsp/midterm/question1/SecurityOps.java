package org.howard.edu.lsp.midterm.question1;

public class SecurityOps {
    /**
     * Encrypts the given text by rearranging characters.
     * 
     * @param text The text to be encrypted.
     * @return The encrypted text.
     */
    public static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        
        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // Check if the character is a letter or digit (ignore punctuation and whitespace)
            if (Character.isLetterOrDigit(c)) {
                // Check if the index is even or odd and append the character accordingly
                if (i % 2 == 0) {
                    encryptedText.append(c);
                } else {
                    // Append the character to the beginning of the string
                    encryptedText.insert(0, c);
                }
            }
        }
        
        return encryptedText.toString();
    }
}
