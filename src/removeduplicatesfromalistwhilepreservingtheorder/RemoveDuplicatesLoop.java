package removeduplicatesfromalistwhilepreservingtheorder;

import java.util.*;

public class RemoveDuplicatesLoop {

    public static void main(String[] args) {
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);
        List<Integer> uniqueNumbers;
        Set<Integer> tmp = new HashSet<>(numbersWithDuplicates);
        uniqueNumbers = new ArrayList<>(tmp);
        System.out.println(uniqueNumbers);
    }
}
