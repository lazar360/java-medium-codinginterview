package detectduplicateelementsinanarray;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a Java program to find all duplicate elements in an array.
 * To detect duplicate elements in an array in Java,
 * you can use various approaches such as using a HashSet, sorting the array,
 * or using nested loops
 */
public class DuplicateElementsBruteForce {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2}; // Example array with duplicates
        boolean hasDuplicates = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    hasDuplicates = true;
                    break;
                }
            }
        }

        if (hasDuplicates) {
            System.out.println("Duplicates found in the array.");
        } else {
            System.out.println("No duplicates found in the array.");
        }
    }
}
