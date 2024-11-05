package countwordsinasentence;

/**
 * Write a Java program to count the number of words in a given sentence
 */
public class WordCount_Opti {
    public static void main(String[] args) {
        String sentence = "This is a sample sentence to count words"; // Example sentence
        System.out.println(countWords(sentence));
    }
    private static String countWords(String sentence) {
        String response = "Number of words in the sentence: ";
        if ((sentence == null || sentence.isEmpty())) return response + " 0";
        return response + " " + sentence.trim().split(" ").length;
    }
}
