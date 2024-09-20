package checkisapalindrome;

/**
 * Write a Java program to check if a given string is a palindrome or not
 */
public class PalindromeCheckFori {
    public static void main(String[] args) {
        String str = "race a car";
        boolean isPalindrome = true;

        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        char[] arr = str.toCharArray();
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(str + (isPalindrome ? " is a palindrome." : " is not a palindrome."));
    }
}
