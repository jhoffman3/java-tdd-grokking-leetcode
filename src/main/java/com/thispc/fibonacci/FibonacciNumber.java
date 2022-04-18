package com.thispc.fibonacci;

import java.util.HashMap;
import java.util.Map;

/**
 * If an interviewer is still using Fibonacci questions typically they want to
 * hear that recursion may be simple but can be inefficient and expensive. You
 * should probably be familiar enough to:
 *
 * - solve it recursively but that has a high Big O complexity
 * - solve it iteratively for lower Big O complexity
 * - discuss recursion plus memoization, which in some cases may be optimal
 *
 * You should be able to write the first two in an interview and at least
 * mention applying memoization with recursion may in some cases be optimal.
 */
public class FibonacciNumber {

    // only used in memoization solution
    Map<Integer,Integer> mapa = new HashMap<>();

    public int fib(int n) {
        if (n < 2) {
            return n;
        }

        int[] fibs = new int[n+1];

        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs[n];
    }

    public int fibRecursive(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }

    public int fibRecursionWithMemoization(int n) {
        if (mapa.containsKey(n)) {
            return mapa.get(n);
        }

        if (n < 2) {
            return n;
        }
        else {
            int f = fib(n - 1) + fib(n - 2);
            mapa.put(n, f);

            return f;
        }
    }
}
