package checkifanumberisprime;

import java.util.Arrays;
import java.util.List;

public class PrimeCheck_Stream {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static void printPrime() {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        boolean containsPrime = numbers.stream()
                .anyMatch(PrimeCheck_Stream::isPrime);
        System.out.println("List contains a prime number: " + containsPrime);

    }

    public static void main(String[] args) {
        PrimeCheck_Stream.printPrime();
        System.out.println(15000 + " is prime : " + PrimeCheck_Stream.isPrime(150000));

    }

}
