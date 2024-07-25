package reverseastring;


/*
Write a Java program to reverse a given string with built-in functions or libraries
 */
public class WithBuiltInFunction_StringBuilder {

    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + new StringBuilder(str).reverse());
    }
}
