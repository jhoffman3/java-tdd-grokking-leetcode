package com.thispc.knapsack;

/*

    This is a pretty good rundown of a couple approaches from a leet code solution.
    The implementation is the memoization example from below.

    Approach
    Let us take an array : { 1 , 5 , 11 , 5 }
    The sum of all elements in the arr = 22 (i.e. even )
    Hence , we can divide the array into two subsets , each having sum = 22/2=11
    Subset1 : {1 , 5 , 5 }
    Subset2 : { 11 }

    Let's take another array , arr : { 1 , 3 , 9 , 10 }
    For this array , sum of all elements = 1 + 3 + 9 + 10 = 23 (i.e odd)
    sum/2 = 23 / 2 = 11.5 . Hence in this case , it is not possible to divide the array into two subset , each having equal sum.

    Imp Conclusion :
    We can divide an array into two subsets having equal sum if & only if , the sum of all elements of the given array comes out to be even. If the sum is odd , then it is not possible .
    Our problem is now reduced to :- Finding a subset in the given array with sum = (sum of elements of given array)/2
    How to proceed
    Hence , first , we find the sum of all elements of the given array .
    if sum = odd , return false .
    If sum = even , find a subset such that , (sum of elements in the subset) = sum/2
    Eg : If arr = { 1 ,2 , 3, 4, 5 ,6, 7}
    sum = 28 (i.e even , hence there is a subset whose sum = 14 )
    Subset : { 3 , 4, 7 } / { 1 , 2 , 5 , 6 }
    Code - 1 ( Recursion):
    The function findSubset checks if there exists a subset whose sum of all elements = sum / 2
    We start traversing from 1st element & check if it can be included in the subset or not.
    If the element > sum , then we can't include it , we move on to the next element.
    If element < sum , then have 2 options:
    1.) include
    2.)exclude
    We explore both options , and if either of the two return true , we return true.
    If element = sum , we return true

        public static boolean canPartition(int[] nums)
            {
                int sum = 0;
                for(int i = 0; i<nums.length ; i++)
                {
                    sum += nums[i];
                }
                if(sum%2 != 0)
                    return false;
                boolean dp[][] = new boolean[nums.length][sum+1];
                boolean ans = findSubset(nums,0,sum/2);
                return ans;
            }
            private static boolean findSubset(int[] nums,int si,int sum) // si = start index
            {
                //base case
                if(si>=nums.length)
                {
                    return false;
                }
                if(nums[si]==sum) // if element = sum , then return true
                    return true;
                else if(nums[si] > sum) // if element > sum , we cannot include it
                    return findSubset(nums,si+1,sum);
                else  // if the element is < sum , then we might include it or exclude it
                {
                    boolean include = findSubset(nums,si+1,sum-nums[si]); //option 1
                    boolean exclude = findSubset(nums,si+1,sum); //option 2
                            //if either of these two options return true , then than means valid subset exists
                    return include || exclude;
                }

            }

        Code -2 (Memoization)
        class Solution
        {
            public boolean canPartition(int[] nums)
            {
               int sum = 0;
                for(int i = 0; i<nums.length ; i++)
                {
                    sum += nums[i];
                }
                if(sum%2 != 0)
                    return false;
                Boolean dp[][] = new Boolean[nums.length][sum+1];
                boolean ans = findSubset(nums,0,sum/2,dp);
                return ans;
            }
            private boolean findSubset(int[] nums,int si,int sum,Boolean dp[][])
            {
                //base case
                if(si>=nums.length)
                {
                    return false;
                }
                //memoization
                if(dp[si][sum] != null)
                    return dp[si][sum];

                if(nums[si]==sum)
                    return true;
                else if(nums[si] > sum)
                {
                    dp[si][sum] = findSubset(nums,si+1,sum,dp);
                    return dp[si][sum];
                }
                else
                {
                    boolean include = findSubset(nums,si+1,sum-nums[si],dp);
                      boolean exclude = findSubset(nums,si+1,sum,dp);
                    dp[si][sum] = include || exclude;
                     return dp[si][sum];
                }
            }
        }
 */
public class PartitionEqualSubsetSum {

    public boolean canPartition(int[] nums) {
        boolean result;

        // if sum of all elems is odd we can't proceed
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }

        if (sum % 2 != 0) {
            result = false;
        } else {
            Boolean[][] dp = new Boolean[nums.length][sum+1];
            result = findSubset(nums, 0, sum/2, dp);
        }

        return result;
    }

    private boolean findSubset(int[] nums, int startIndex, int sum, Boolean[][] dp)
    {
        //base case
        if (startIndex >= nums.length) {
            return false;
        }

        //memoization
        if (dp[startIndex][sum] != null) {
            return dp[startIndex][sum];
        }

        if (nums[startIndex] == sum) {
            return true;
        }
        else if (nums[startIndex] > sum) {
            dp[startIndex][sum] = findSubset(nums,startIndex+1,sum,dp);
            return dp[startIndex][sum];
        }
        else {
            boolean include = findSubset(nums,startIndex+1,sum-nums[startIndex],dp);
            boolean exclude = findSubset(nums,startIndex+1,sum,dp);
            dp[startIndex][sum] = include || exclude;
            return dp[startIndex][sum];
        }
    }
}