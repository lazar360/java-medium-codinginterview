package findthekthsmallest;

import java.util.Arrays;

public class FindTheKthSmallestLoop {

    public static void main(String[] args) {

        int[] array = {4, 2, 7, 1, 5, 3, 6};
        int k = 3; // Find the 3rd smallest element
        array = Arrays.stream(array).sorted().toArray();
        int smallest = array[k-1];
        for (int i = k-1; i < array.length; i++) {
            if (array[i] < smallest){
                smallest = array[i];
            }
        }

        System.out.println(k+"th smallest number : " + smallest);
    }


}
