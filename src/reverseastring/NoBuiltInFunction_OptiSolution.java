package reverseastring;


/*
Write a Java program to reverse a given string without using any built-in functions or libraries
 */
public class NoBuiltInFunction_OptiSolution {

    public static void main(String[] args) {
        String str = "Hello, world!";
        String reversed = reverseString(str);
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed);
    }

    private static String reverseString(String str) {
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length / 2; i++) {
            char tmp = strArray[i];
            strArray[i] = strArray[strArray.length - i - 1];
            strArray[strArray.length - i - 1] = tmp;
        }
        return String.valueOf(strArray);
    }

}
