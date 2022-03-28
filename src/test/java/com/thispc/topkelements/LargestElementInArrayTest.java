package com.thispc.topkelements;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
215. Kth Largest Element in an Array

Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Constraints:

1 <= k <= nums.length <= 10^4
-10^4 <= nums[i] <= 10^4
 */
public class LargestElementInArrayTest {

    /*
        Example 1:

        Input: nums = [3,2,1,5,6,4], k = 2
        Output: 5
     */
    @Test
    public void testLeetCodeExample1() {
        int[] nums = new int[]{3,2,1,5,6,4};
        int target = 2;
        int expected = 5;
        LargestElementInArray r = new LargestElementInArray();
        int actual = r.findKthLargest(nums, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /*
        Example 2:

        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
        Output: 4

     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{3,2,3,1,2,4,5,5,6};
        int target = 4;
        int expected = 4;
        LargestElementInArray r = new LargestElementInArray();
        int actual = r.findKthLargest(nums, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}