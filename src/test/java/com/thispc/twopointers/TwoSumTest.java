package com.thispc.twopointers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4 -10^9 <= nums[i] <= 10^9 -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class TwoSumTest {

    /**
     *  * Example 1:
     *  *
     *  * Input: nums = [2,7,11,15], target = 9
     *  * Output: [0,1]
     *  * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    @Test
    public void testLeetCodeExample1() {
        int target = 9;
        int[] nums = new int[]{2,7,11,15};
        int[] expected = new int[]{0,1};
        TwoSum r = new TwoSum();
        int[] actual = r.twoSum(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
    /**
     *  * Example 2:
     *  *
     *  * Input: nums = [3,2,4], target = 6
     *  * Output: [1,2]
     */
    @Test
    public void testLeetCodeExample2() {
        int target = 6;
        int[] nums = new int[]{3,2,4};
        int[] expected = new int[]{1,2};
        TwoSum r = new TwoSum();
        int[] actual = r.twoSum(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    /**
     *  * Example 3:
     *  *
     *  * Input: nums = [3,3], target = 6
     *  * Output: [0,1]
      */
    @Test
    public void testLeetCodeExample3() {
        int target = 6;
        int[] nums = new int[]{3,3};
        int[] expected = new int[]{0,1};
        TwoSum r = new TwoSum();
        int[] actual = r.twoSum(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    /**
     * The given examples all have solutions that involve a consecutive pair,
     * so it doesn't really require two pointers and could lead to a faulty
     * solution
     *
     * Input: nums = [2,11,7,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */
    @Test
    public void testLeetCodeExample4() {
        int target = 9;
        int[] nums = new int[]{2,11,7,15};
        int[] expected = new int[]{0,2};
        TwoSum r = new TwoSum();
        int[] actual = r.twoSum(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}