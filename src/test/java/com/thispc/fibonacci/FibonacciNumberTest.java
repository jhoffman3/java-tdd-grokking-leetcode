package com.thispc.fibonacci;

import com.thispc.util.TestUtils;
import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 509. Fibonacci Number The Fibonacci numbers, commonly denoted F(n) form a
 * sequence, called the Fibonacci sequence, such that each number is the sum of
 * the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1 F(n) = F(n - 1) + F(n - 2), for n > 1.
 *
 * Given n, calculate F(n).
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 0 <= n <= 30
 */
public class FibonacciNumberTest {

    /*
     * Example 1:
     *
     * Input: n = 2
     * Output: 1
     * Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
     */
    @Test
    public void testLeetCodeExample1() {
        int n = 2;
        int expected = 1;
        FibonacciNumber r = new FibonacciNumber();
        int actual = r.fib(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /*
     * Example 2:
     *
     * Input: n = 3
     * Output: 2
     * Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
     */
    @Test
    public void testLeetCodeExample2() {
        int n = 3;
        int expected = 2;
        FibonacciNumber r = new FibonacciNumber();
        int actual = r.fib(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
     * Example 3:
     *
     * Input: n = 4
     * Output: 3
     * Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
     */
    @Test
    public void testLeetCodeExample3() {
        int n = 4;
        int expected = 3;
        FibonacciNumber r = new FibonacciNumber();
        int actual = r.fib(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void test0() {
        int n = 0;
        int expected = 0;
        FibonacciNumber r = new FibonacciNumber();
        int actual = r.fib(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void test30() {
        int n = 30;
        int expected = 832040;
        FibonacciNumber r = new FibonacciNumber();
        int actual = r.fib(n);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}