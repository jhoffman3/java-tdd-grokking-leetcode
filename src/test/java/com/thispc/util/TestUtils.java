package com.thispc.util;

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
}

