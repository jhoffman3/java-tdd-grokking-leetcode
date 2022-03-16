package com.thispc.twoheaps;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
public class MedianFinder {

    private final PriorityQueue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());
    private final PriorityQueue<Integer> high = new PriorityQueue<>();

    public MedianFinder() {
        //intentionally blank
    }

    public void addNum(int num) {
        if (low.isEmpty() || num < low.peek()) {
            low.offer(num);
        }
        else {
            high.offer(num);
        }
        rebalance();
    }

    private void rebalance() {
        PriorityQueue<Integer> bigger = high.size() > low.size() ? high : low;
        PriorityQueue<Integer> smaller = high.size() > low.size() ? low : high;
        while(bigger.size() - smaller.size() >= 2){
            smaller.offer(bigger.poll());
        }
    }

    public double findMedian() {
        PriorityQueue<Integer> bigger = high.size() > low.size() ? high : low;
        PriorityQueue<Integer> smaller = high.size() > low.size() ? low : high;
        if (bigger.size() == smaller.size()) {
            return (bigger.peek() + smaller.peek())/2.0;
        } else {
            return bigger.peek();
        }
    }
}

