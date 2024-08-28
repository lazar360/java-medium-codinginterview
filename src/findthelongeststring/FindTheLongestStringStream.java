package findthelongeststring;

import java.util.*;

/*
Find the longest string in a list of strings using Java streams
 */
public class FindTheLongestStringStream {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "tomato", "fish", "chips", "mango"));

        Optional<String> listLongest = list
                .stream()
                .max(Comparator.comparing(String::length));

        System.out.println(listLongest);
    }
}
