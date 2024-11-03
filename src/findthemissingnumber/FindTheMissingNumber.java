package findthemissingnumber;

public class FindTheMissingNumber {

    /*
    Given an array containing n distinct numbers taken from 0, 1, 2, …, n, find the one that is missing from the array
     */
    public static void main(String[] args) {

        int[] nums = {3, 0, 1, 5, 2, 6, 4}; // Example array
        int missing = findMissingNumber(nums);
        System.out.println("The missing number is: " + missing);

    }

    /**
     * To find the missing number in an array containing distinct numbers
     *     taken from 0 to n, you can utilize the concept of arithmetic
     *     progression and Gauss’s formula
     * @param nums array of int
     * @return int
     */
    public static int findMissingNumber(int[] nums) {

        int n = nums.length;
        // Calculate the expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        // Calculate the actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        // The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;

    }
}
