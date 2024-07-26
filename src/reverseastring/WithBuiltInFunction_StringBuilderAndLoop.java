package reverseastring;


/*
Write a Java program to reverse a given string with built-in functions or libraries
 */
public class WithBuiltInFunction_StringBuilderAndLoop {

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseString(str));
    }

    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
