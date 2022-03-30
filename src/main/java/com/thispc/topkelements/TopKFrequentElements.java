package com.thispc.topkelements;

import java.util.*;

public class TopKFrequentElements {

    public int[] topKFrequentInefficient(int[] nums, int target) {

        Map<Integer, Integer> tm
                = new HashMap<>();
        for (int i : nums) {
            if (tm.containsKey(i)) {
                tm.put(i,tm.get(i) + 1);
            } else {
                tm.put(i,1);
            }
        }

        return tm.entrySet().stream()
                .limit(target)
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .map(Map.Entry::getKey)
                .mapToInt(Integer::intValue).toArray();

    }

    /*
        The leet code suggested solution
     */
    public int[] topKFrequent(int[] nums, int k) {
        // O(1) time
        if (k == nums.length) {
            return nums;
        }

        // 1. build hash map : character and how often it appears
        // O(N) time
        Map<Integer, Integer> count = new HashMap();
        for (int n: nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // init heap 'the less frequent element first'
        Queue<Integer> heap = new PriorityQueue<>(
                (n1, n2) -> count.get(n1) - count.get(n2));

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: count.keySet()) {
            heap.add(n);
            if (heap.size() > k) heap.poll();
        }

        // 3. build an output array
        // O(k log k) time
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; --i) {
            top[i] = heap.poll();
        }
        return top;
    }
}
