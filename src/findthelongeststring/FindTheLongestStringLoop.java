package findthelongeststring;

import java.util.*;

/*
Find the longest string in a list of strings using loop
 */
public class FindTheLongestStringLoop {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "tomato", "fish", "chips", "mango"));
        String longest = "no result";
        if (!list.isEmpty()){
            longest = list.get(0) == null ? " " : list.get(0);
        }

        for (String str: list) {
            if (longest.length() < str.length()){
                longest = str;
            }
        }
        System.out.println(longest);
    }
}
