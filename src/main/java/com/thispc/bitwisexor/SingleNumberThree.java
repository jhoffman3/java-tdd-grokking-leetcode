package com.thispc.bitwisexor;

/*
    This solution relies on the fact that XOR-ing all elements of an array equals the value of a non-repeating value.
    @see {@link SingleNumber}
 */

public class SingleNumberThree {

    public int[] singleNumber(int[] nums) {
        int xOry = 0;

        // Take xor of all the elements in the nums array.
        // Result is xor of the two unique elements i.e. xOry (if x,y are the only elements that appear once)
        for (int val: nums){
            xOry ^= val;
        }

        // Find the right-most set bit mask
        int rsbm = xOry & -xOry;
        int x = 0;
        int y = 0;

        // Take xor of all values with bit off (x) or on (y)
        for (int val: nums){
            if ((val & rsbm) == 0) {  //This condition checks if the number of 1s are even, this means that the bit is off.
                x = x ^ val;
            } else { // This means the number of bits are odd i.e. the bit is on.
                y = y ^ val;
            }
        }

        return new int[]{x,y};
    }
}