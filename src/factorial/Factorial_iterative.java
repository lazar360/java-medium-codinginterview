package factorial;

import java.util.Scanner;

public class Factorial_iterative {
    /*
     Write a program that prints the factorial of a number.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number");
        int number = scanner.nextInt();
        int result = 1;

        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("factorial of "+ number + " is : " + result);
        scanner.close();
    }
}
