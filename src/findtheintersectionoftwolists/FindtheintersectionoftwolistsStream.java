package findtheintersectionoftwolists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FindtheintersectionoftwolistsStream {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList( 2, 3, 4, 5, 6);
        List<Integer> mergedList = list1.stream().filter(list2::contains).toList();
        System.out.println(mergedList);
    }
}
