package com.thispc.slidingwindow;

public class MinimumSizeSubarraySum {
    
    public int minSubArrayLen(int target, int[] nums) {

        // two pointer
        int answer = Integer.MAX_VALUE;
        int leftPointer = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            // add nums[i] to sum
            sum += nums[i];

            while (sum >= target) {
                // update answer where i + 1 - leftPointer is the size of current subarray
                answer = Math.min(answer, i + 1 - leftPointer);
                // subtract nums[leftPointer] from sum, then increment it
                // this is sliding the window, as we know sum >= target
                sum -= nums[leftPointer++];
            }
        }

        return (answer != Integer.MAX_VALUE ? answer : 0);
    }
}
