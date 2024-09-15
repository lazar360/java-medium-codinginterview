package detectduplicateelementsinanarray;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to find all duplicate elements in an array.
 * To detect duplicate elements in an array in Java,
 * you can use various approaches such as using a HashSet, sorting the array,
 * or using nested loops
 */
public class DuplicateElements {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2, 6, 7, 8, 3}; // Example array with duplicates
        Set<Integer> set = new HashSet<>();
        boolean hasDuplicates = false;

        for (int num : nums) {
            if (!set.add(num)) {
                hasDuplicates = true;
                break;
            }
        }

        if (hasDuplicates) {
            System.out.println("Duplicates found in the array.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}
