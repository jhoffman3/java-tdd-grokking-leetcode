package com.thispc.twoheaps;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    Given an integer array nums, find the contiguous subarray (containing at least one
    number) which has the largest sum and return its sum.

    A subarray is a contiguous part of an array.

    1 <= nums.length <= 10^5
    -10^4 <= nums[i] <= 10^4
 */
public class MaximumSubarrayTest {

    //constraint guarantees non-empty array so skipped validation

    /*
    Example 1

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.

    */

    @Test
    public void testLeetcodeExample1() {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int expected = 6;
        int actual = MaximumSubarray.maxSubArray(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: nums = [1]
        Output: 1
        */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{1};
        int expected = 1;
        int actual = MaximumSubarray.maxSubArray(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 3:
        Input: nums = [5,4,-1,7,8]
        Output: 23
     */
    @Test
    public void testLeetCodeExample3() {
        int[] nums = new int[]{5,4,-1,7,8};
        int expected = 23;
        int actual = MaximumSubarray.maxSubArray(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testAllNegative() {
        int[] nums = new int[]{-1,-2};
        int expected = -1;
        int actual = MaximumSubarray.maxSubArray(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}