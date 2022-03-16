package com.thispc.twoheaps;

/*
1 <= nums.length <= 10^5
-10^4 <= nums[i] <= 10^4
 */
public class MaximumSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i : nums) {
            sum = sum + i;
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
