package com.thispc.bitwisexor;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        // a number ^ itself = 0
        // 0 ^ a number equals that number
        // which would be useful if the array was sorted
        // but turns out XOR-ing all the elements, equals the val of the non-repeating one anyway
        // if you want to see a detailed example of that, go here:
        // https://leetcode.com/problems/single-number/discuss/1772139/C++or-Explained-Everything-w-WHY-XOR-WORKSor-BRUTE-FORCE-TO-OPTIMIZEDor-STEP-BY-STEP-DRY-RUN

        int answer = nums[0];
        for (int i = 1; i < nums.length; i++) {
            answer ^= nums[i];
        }
        return answer;
    }
}
