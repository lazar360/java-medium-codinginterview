package fizzbuzzproblem;

import java.util.stream.IntStream;

public class FizzBuzzProblem_Stream {

    /*
    Write a program that prints the numbers from 1 to 100. But for multiples of three,
    print “Fizz” instead of the number, and for the multiples of five, print “Buzz”.
    For numbers that are multiples of both three and five, print “FizzBuzz”.
     */
    public static void main(String[] args) {

        IntStream.range(1, 100)
                .mapToObj(i -> i % 3 == 0 && i % 5 == 0 ? "FizzBuzz" :
                        i % 3 == 0 ? "Fizz" :
                                i % 5 == 0 ? "Buzz" : String.valueOf(i))
                .forEach(System.out::println);
    }

}
