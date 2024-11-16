package find_largest_sum_of_continious_subarray;

public class MaxSubArray {


    // find the largest possible sum of a contiguous subarray in an array

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, 1, 2, -1, 5, -4}; // 11
        System.out.println(maxSubArray(arr));
        int[] arr2 = {-2, 3, -5, 2, 2, -1, 4, -3}; // 7
        System.out.println(maxSubArray(arr2));

    }

    public static int maxSubArray(int[] arr) {
        if(arr.length == 0) return 0;

       int localMaximum = 0;
        int globalMaximum = Integer.MIN_VALUE;

        for (int num : arr) {
            localMaximum = Math.max(num, localMaximum + num);
            globalMaximum = Math.max(globalMaximum, localMaximum);
        }
        return globalMaximum;
    }

    /* Response :
    11
    7
     */
}
