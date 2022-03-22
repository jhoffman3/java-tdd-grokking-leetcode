package com.thispc.modifiedbinarysearch;

import java.util.Arrays;

public class BinarySearch {

    int search(int[] nums, int target) {
        //System.out.println("Target " + target + " nums " + Arrays.toString(nums));
        int pivot = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            //System.out.println("Pivot " + pivot + " left " + left + " right " + right);

            if (nums[pivot] == target)  {
                return pivot;
            }
            if (target < nums[pivot]) {
                right = pivot - 1;
            }
            else {
                left = pivot + 1;
            }
        }
        return -1;
    }
}
