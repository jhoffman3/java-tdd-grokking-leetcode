package com.thispc.slidingwindow;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 209. Minimum Size Subarray Sum Given an array of positive integers nums and a
 * positive integer target, return the minimal length of a contiguous subarray
 * [numsl, numsl+1, ..., numsr-1, numsr] of which the sum is greater than or
 * equal to target. If there is no such subarray, return 0 instead.
 * <p>
 * Constraints:
 * <p>
 * 1 <= target <= 10^9 1 <= nums.length <= 10^5 1 <= nums[i] <= 10^5
 */
public class MinimumSizeSubarraySumTest {

    /**
     * Example 1:
     * <p>
     * Input: target = 7, nums = [2,3,1,2,4,3] Output: 2 Explanation: The
     * subarray [4,3] has the minimal length under the problem constraint.
     */
    @Test
    public void testLeetCodeExample1() {
        int[] nums = new int[]{2,3,1,2,4,3};
        int target = 7;
        int expected = 2;

        MinimumSizeSubarraySum r = new MinimumSizeSubarraySum();
        int actual = r.minSubArrayLen(target, nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /**
     * Example 2:
     *
     * Input: target = 4, nums = [1,4,4]
     * Output: 1
     *
     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{1,4,4};
        int target = 4;
        int expected = 1;

        MinimumSizeSubarraySum r = new MinimumSizeSubarraySum();
        int actual = r.minSubArrayLen(target, nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /**
     * Example 3:
     *
     * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
     * Output: 0
     *
     */
    @Test
    public void testLeetCodeExample3() {
        int[] nums = new int[]{1,1,1,1,1,1,1,1};
        int target = 11;
        int expected = 0;

        MinimumSizeSubarraySum r = new MinimumSizeSubarraySum();
        int actual = r.minSubArrayLen(target, nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}