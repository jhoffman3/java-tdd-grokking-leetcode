package com.thispc.bitwisexor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.security.Signature;

/*
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one.
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Constraints:

1 <= nums.length <= 3 * 10^4
-3 * 10^4 <= nums[i] <= 3 * 10^4
Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumberTest {

    /*
        Example 1:

        Input: nums = [2,2,1]
        Output: 1
     */
    @Test
    public void testLeetCodeExample1() {
        int[] nums = new int[]{2,2,1};
        int expected = 1;
        SingleNumber r = new SingleNumber();
        int actual = r.singleNumber(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{4,1,2,1,2};
        int expected = 4;
        SingleNumber r = new SingleNumber();
        int actual = r.singleNumber(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 3:

        Input: nums = [1]
        Output: 1
     */
    @Test
    public void testLeetCodeExample3() {
        int[] nums = new int[]{1};
        int expected = 1;
        SingleNumber r = new SingleNumber();
        int actual = r.singleNumber(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}