package countwordsinasentence;

/**
 * Write a Java program to count the number of words in a given sentence
 */
public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words"; // Example sentence
        int wordCount = countWords(sentence);
        System.out.println("Number of words in the sentence: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0; // If the sentence is empty or null, return 0
        }
        String[] words = sentence.trim().split("\\s+"); // Split the sentence into words using whitespace as delimiter
        return words.length; // Return the number of words
    }
}
