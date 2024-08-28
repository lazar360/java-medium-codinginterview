package findthekthsmallest;

import java.util.Arrays;

public class FindTheKthSmallestStream {

    public static void main(String[] args) {

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element

        Integer smallest = Arrays.stream(array)
                .sorted()
                .skip(k-1)
                .min()
                .orElse(0);

        System.out.println(k+"th smallest number : " + smallest);
    }


}
