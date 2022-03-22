package com.thispc.bitwisexor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
260. Single Number III
Given an integer array nums, in which exactly two elements appear only once and
 all the other elements appear exactly twice. Find the two elements that appear
 only once.

 You can return the answer in any order.

You must write an algorithm that runs in linear runtime complexity and uses
only constant extra space.

Constraints:

2 <= nums.length <= 3 * 10^4
-231 <= nums[i] <= 231 - 1
Each integer in nums will appear twice, only two integers will appear once.
 */
public class SingleNumberThreeTest {

    /*
        Example 1:

        Input: nums = [1,2,1,3,2,5]
        Output: [3,5]
        Explanation:  [5, 3] is also a valid answer.
     */
    @Test
    public void testLeetCodeExample1() {
        int[] input = new int[]{1,2,1,3,2,5};
        int[] expected = new int[]{3,5};
        SingleNumberThree r = new SingleNumberThree();
        int[] actual = r.singleNumber(input);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    /*
        Example 2:

        Input: nums = [-1,0]
        Output: [-1,0]
     */
    @Test
    public void testLeetCodeExample2() {
        int[] input = new int[]{-1,0};
        int[] expected = new int[]{0, -1};
        SingleNumberThree r = new SingleNumberThree();
        int[] actual = r.singleNumber(input);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }

    /*
        Example 3:

        Input: nums = [0,1]
        Output: [1,0]
     */
    @Test
    public void testLeetCodeExample3() {
        int[] input = new int[]{0,1};
        int[] expected = new int[]{1,0};
        SingleNumberThree r = new SingleNumberThree();
        int[] actual = r.singleNumber(input);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}
