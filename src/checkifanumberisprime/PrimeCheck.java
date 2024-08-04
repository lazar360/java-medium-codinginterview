package checkifanumberisprime;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29; // Example number
        boolean isPrime = isPrime(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (num <= 3) {
            return true; // 2 and 3 are prime
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }
        // Check for prime using trial division up to the square root of the number
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false; // If number is divisible by i or i+2, it's not prime
            }
        }
        return true; // If number is not divisible by any smaller prime, it's prime
    }
}
