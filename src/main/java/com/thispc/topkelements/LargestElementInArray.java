package com.thispc.topkelements;

import java.util.Arrays;

public class LargestElementInArray {

    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}