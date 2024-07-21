package reverseastring;


/*
Write a Java program to reverse a given string without using any built-in functions or libraries
 */
public class NoBuiltInFunction {

    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            // Swap characters at left and right indices
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move pointers towards the center
            left++;
            right--;
        }
        // Convert char array back to string
        return new String(chars);
    }

}
