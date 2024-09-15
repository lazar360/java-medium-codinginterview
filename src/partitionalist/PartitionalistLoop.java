package partitionalist;

import java.util.*;
import java.util.stream.Collectors;

public class PartitionalistLoop {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> partitioned = new HashMap<>();

        partitioned.put(true, new ArrayList<>());
        partitioned.put(false, new ArrayList<>());

        for (Integer number : numbers) {
            partitioned.get(number % 2 == 0).add(number);
        }

        List<Integer> evenNumbers = partitioned.get(true);
        List<Integer> oddNumbers = partitioned.get(false);

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}
