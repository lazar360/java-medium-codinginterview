package factorial;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial_stream {
    /*
     Write a program that prints the factorial of a number.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        System.out.println("factorial of "+ number + " is : " + IntStream.range(1, number + 1).reduce(1, (a,b) -> a * b));
        scanner.close();
    }
}
