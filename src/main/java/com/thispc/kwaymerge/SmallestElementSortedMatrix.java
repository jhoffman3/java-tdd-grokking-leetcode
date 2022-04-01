package com.thispc.kwaymerge;

import java.util.PriorityQueue;

public class SmallestElementSortedMatrix {

    /* big o doesn't meet requirements */
//    public int kthSmallest(int[][] matrix, int k) {
//        PriorityQueue<Integer> q = new PriorityQueue();
//        for (int[] x : matrix) {
//            for (int y : x) {
//                q.offer(y);
//                if (q.size() == k) {
//                    break;
//                }
//            }
//        }
//
//        Integer[] r = q.toArray(new Integer[k]);
//        return r[k - 1];
//    }

    /* one of the leetcode solutions using binary search */
    public int kthSmallest(int[][] m, int k) {
        int n = m.length;
        int l = m[0][0], r = m[n-1][n-1];
        while(l < r) {
            int mid = l + (r-l)/2;
            if(countLessOrEqual(m, mid) >= k) r= mid;
            else l = mid + 1;
        }
        return l;
    }
    //find all number that is less or equal than x
    public int countLessOrEqual(int[][] m, int x) {
        int n = m.length;
        int ans =0, c = n - 1;
        for(int i = 0; i < n; ++i) {
            while(c>=0 && m[i][c] > x) c--;
            ans += (c+1);
        }
        return ans;
    }
}
