package findthefrequencyofeachword;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyStream {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words
                .stream()
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting())
                );

        wordFrequency.forEach((key, value) -> System.out.println("key : " + key + " - " + "value : " + value));
    }
}
