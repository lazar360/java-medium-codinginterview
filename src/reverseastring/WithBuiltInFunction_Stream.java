package reverseastring;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Write a Java program to reverse a given string with built-in functions or libraries
 */
public class WithBuiltInFunction_Stream {

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reverseString(str));
    }

    public static String reverseString(String str) {
        return IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length() - i - 1))
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
