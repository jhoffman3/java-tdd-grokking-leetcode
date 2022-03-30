package com.thispc.util;

import com.thispc.kwaymerge.ListNode;

import java.util.Objects;

public class TestUtils {

    /*
        Log elapsed time between start and end nanoseconds

        EG:
            long start = System.nanoTime();
            [...code to be timed]
            long end = System.nanoTime();
            TestUtils.logElapsed(start, end);
     */
    public static void logElapsed(long startNs, long endNs) {
        long elapsedNanos = endNs - startNs;
        long elapsedMillis = elapsedNanos / 1000000;
        long remainingNanos = elapsedNanos % 1000000;
        System.out.println(elapsedMillis + " ms " + elapsedMillis + remainingNanos + " ns");
    }

    public static void printRecursive(ListNode head) {
        if (head != null) {
            System.out.print(head.getVal());
            if (!Objects.isNull(head.getNext())) {
                System.out.print("->");
            } else {
                System.out.println();
            }
            printRecursive(head.getNext());
        }
    }

}

