package findtheintersectionoftwolists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindtheintersectionoftwolistsLoop {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList( 2, 3, 4, 5, 6);
        List<Integer> mergedList = new ArrayList<>();
        for (Integer theInt : list1) {
            if (list2.contains(theInt)){
                mergedList.add(theInt);
            }
        }
        System.out.println(mergedList);
    }
}
