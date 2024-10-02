package checkisapalindrome;

/**
 * Write a Java program to check if a given string is a palindrome or not
 */
public class PalindromeCheckWhile {
    public static void main(String[] args) {
        String str = "radar"; // Example string
        boolean isPalindrome = checkPalindrome(str);
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            // Compare characters at left and right indices
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        return true; // If all characters match, it's a palindrome
    }
}
