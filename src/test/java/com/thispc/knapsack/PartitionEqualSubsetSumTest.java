package com.thispc.knapsack;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    416. Partition Equal Subset Sum

    Given a non-empty array nums containing only positive integers, find if the array can
    be partitioned into two subsets such that the sum of elements in both subsets is equal.

    Constraints:

    1 <= nums.length <= 200
    1 <= nums[i] <= 100
 */
public class PartitionEqualSubsetSumTest {

    /*
        Example 1:

        Input: nums = [1,5,11,5]
        Output: true
        Explanation: The array can be partitioned as [1, 5, 5] and [11].
     */
    @Test
    public void testLeetCodeExample1() {
        int[] nums = new int[]{1,5,11,5};
        boolean expected = true;
        PartitionEqualSubsetSum r = new PartitionEqualSubsetSum();
        boolean actual = r.canPartition(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: nums = [1,2,3,5]
        Output: false
        Explanation: The array cannot be partitioned into equal sum subsets.
     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{1,2,3,5};
        boolean expected = false;
        PartitionEqualSubsetSum r = new PartitionEqualSubsetSum();
        boolean actual = r.canPartition(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}