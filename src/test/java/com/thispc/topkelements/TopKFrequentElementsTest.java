package com.thispc.topkelements;

import com.thispc.util.TestUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    347. Top K Frequent Elements

    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

    Constraints:

    1 <= nums.length <= 10^5
    k is in the range [1, the number of unique elements in the array].
    It is guaranteed that the answer is unique.
 */
public class TopKFrequentElementsTest {

    /*
        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
     */

    @Test
    public void testLeetCodeExample1() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int target = 2;
        int[] expected = new int[]{1,2};
        TopKFrequentElements r = new TopKFrequentElements();
        int[] actual = r.topKFrequent(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
    /*
        Example 2:

        Input: nums = [1], k = 1
        Output: [1]
     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{1};
        int target = 1;
        int[] expected = new int[]{1};
        TopKFrequentElements r = new TopKFrequentElements();
        int[] actual = r.topKFrequent(nums, target);
        Assertions.assertThat(actual).containsExactlyInAnyOrder(expected);
    }
}