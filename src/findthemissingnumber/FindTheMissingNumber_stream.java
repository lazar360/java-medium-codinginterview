package findthemissingnumber;

import java.util.*;

public class FindTheMissingNumber_stream {

    /*
    Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array
     */
    public static void main(String[] args) {

        // 1- Make your random int list
        Random random = new Random();
        Set<Integer> setInt = new HashSet<>(9);
        while(setInt.size()<9){
            setInt.add(random.ints(0,10).findFirst().getAsInt());
        }
        List<Integer> nums = setInt.stream().toList();

        // 2- call to method
        int missing = findMissingNumber(nums, nums.size());

        // 3- log the response on console
        System.out.println("The missing number in " + nums + " is : " + missing);
    }

    /**
     * To find the missing number in an array containing distinct numbers
     * taken from 0 to n, you can utilize the concept of arithmetic
     * progression and Gauss’s formula
     *
     * @param nums array of int
     * @param size
     * @return int
     */
    public static int findMissingNumber(List<Integer> nums, int size) {
        // The missing number is the difference between the expected sum and the actual sum (of all numbers)
        return (size * (size + 1) / 2) - nums.stream().mapToInt(a -> a).sum();
    }
}
