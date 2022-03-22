package com.thispc.subset;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
78. Subsets

Given an integer array nums of unique elements, return all possible subsets
(the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Constraints:

1 <= nums.length <= 10
-10 <= nums[i] <= 10
All the numbers of nums are unique.
 */
public class SubsetsTest {
    /*
        Example 1:

        Input: nums = [1,2,3]
        Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
     */
    @Test
    public void testLeedCodeExample1() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        List<Integer> a = new ArrayList<Integer>(Arrays.asList());
        List<Integer> c = new ArrayList<Integer>(Arrays.asList(1));
        List<Integer> d = new ArrayList<Integer>(Arrays.asList(2));
        List<Integer> e = new ArrayList<Integer>(Arrays.asList(1, 2));
        List<Integer> f = new ArrayList<Integer>(Arrays.asList(3));
        List<Integer> g = new ArrayList<Integer>(Arrays.asList(1, 3));
        List<Integer> h = new ArrayList<Integer>(Arrays.asList(2, 3));
        List<Integer> i = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        expected.add(a);
        expected.add(c);
        expected.add(d);
        expected.add(e);
        expected.add(f);
        expected.add(g);
        expected.add(h);
        expected.add(i);
        Subsets subsets = new Subsets();
        List<List<Integer>> actual = subsets.subsets(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: nums = [0]
        Output: [[],[0]]
     */
    @Test
    public void testLeetCodeExample2() {
        int[] nums = new int[]{0};
        List<List<Integer>> expected = new LinkedList<>();
        int[] one = new int[0];
        int[] two = new int[]{0};

        List<Integer> result1 = new ArrayList<Integer>(Arrays.asList());
        List<Integer> result2 = new ArrayList<Integer>(Arrays.asList(0));

        expected.add(result1);
        expected.add(result2);

        Subsets subsets = new Subsets();
        List<List<Integer>> actual = subsets.subsets(nums);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}