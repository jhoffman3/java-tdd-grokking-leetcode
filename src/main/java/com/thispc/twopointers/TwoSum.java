package com.thispc.twopointers;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int numsSize = nums.length;
        int leftIndex = 0;
        int rightIndex = 0;

        for (int i = 0; i < numsSize; i++) {
            int iVal = nums[i];
            leftIndex = i;

            for (int j = 0; j < numsSize; j++) {
                rightIndex = j;
                if (j != i && (iVal + nums[j] == target)) {
                    break;
                }
            }
            if (nums[leftIndex] + nums[rightIndex] == target) {
                break;
            }
        }
        return new int[]{leftIndex, rightIndex};
    }
}
