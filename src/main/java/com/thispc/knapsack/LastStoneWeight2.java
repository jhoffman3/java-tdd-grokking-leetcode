package com.thispc.knapsack;

public class LastStoneWeight2 {

    public int lastStoneWeightII(int[] stones) {
        // this problem is similar to divide an array into two parts
        // and make sure the difference between them is smallest.
        // ==> knapsack problem, value is stones[i], weight is stone[i]
        // to find the maximum value(maxValue) we can get with maximum weight.
        // the min difference between two parts can be achieved by
        // [sum(of all stones) - maxValue](the other half) - maxValue;

        // 1º first calculate the middle of the stones weight
        //    then the problem is to find the maximum weight we can form with [middleStoneWeight]
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            sum += stones[i];
        }

        int maxWeight = sum / 2;
        int[] maxWeightAchieved = new int[maxWeight + 1];
        // knapsack problem solution:
        // for every stone adding into the 'bag', the maximum value<weight> we can achieve
        // is current bag's value(not adding current stone)
        // OR
        // the maximum value we can achieve with weight - stones[i]; plus the value of stones[i];
        for (int i = 0; i < stones.length; i++) {
            for (int weight = maxWeight; weight >= stones[i]; weight--) {
                maxWeightAchieved[weight] = Math.max(maxWeightAchieved[weight],
                        maxWeightAchieved[weight - stones[i]] + stones[i]);
            }
        }

        return sum - maxWeightAchieved[maxWeight] - maxWeightAchieved[maxWeight];
    }
}