package selecttworandomwords;

import java.util.*;

public class selectTwoRandomWords {
    public static void main(String[] args) {

        // 1- detect a word in a string
        String str = "Hello world and everybody and wolrd !";
        List<String> stringList = Arrays.asList(str.split(" "));
        System.out.println("stringList contains world ? " + stringList.contains("world"));
        System.out.println("stringList contains worl ? " + stringList.contains("worl"));

        // 2- detect a duplicate
        Set<String> stringSet = new HashSet<>();
        for (String word : stringList) {
            if (!stringSet.add(word)){
                System.out.println("Already contains : " + word);
            }
        }

        // 3 - select 2 different random numbers
        Set<Integer> intSet = new HashSet<>(2);
        while (intSet.size() != 2){
            int randomInt = new Random().nextInt(0,6);
            intSet.add(randomInt);
        }

        // 4- select two random words in strlist
        for (Integer number : intSet) {
            System.out.println(stringList.get(number));
        }
    }
}
