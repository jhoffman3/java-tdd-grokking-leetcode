package com.thispc.bitwisexor;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumberThree {

    public int[] singleNumber(int[] nums) {
        int[] result = new int[2];
        int xxory = 0;

        for (int val: nums){
            xxory = xxory ^ val;      // sum of non-repeating
        }

        int rsbm = xxory & -xxory;
        int x = 0, y = 0;

        for (int val: nums){
            if ((val & rsbm) == 0) {  //This condition checks if the number of 1s are even, this means that the bit is off.{
                x = x ^ val;
            } else { // This means the number of bits are odd i.e the bit is on.
                y = y ^ val;
            }
        }
        result[0] = x;
        result[1] = y;
        return result;
    }
}