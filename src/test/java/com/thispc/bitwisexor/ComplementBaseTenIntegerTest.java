package com.thispc.bitwisexor;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its
 binary representation.

For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
Given an integer n, return its complement.

Constraints:

0 <= n < 10 pow 9
 */
public class ComplementBaseTenIntegerTest {

    /*
        Example 1:
        Input: n = 5
        Output: 2
        Explanation: 5 is "101" in binary, with complement "010" in binary, which is 2 in base-10.
     */
    @Test
    public void testLeetCodeExample1() {
        int input = 5;
        int expected = 2;
        ComplementBaseTenInteger r = new ComplementBaseTenInteger();
        int actual = r.bitwiseComplement(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:
        Input: n = 7
        Output: 0
        Explanation: 7 is "111" in binary, with complement "000" in binary, which is 0 in base-10.
     */
    @Test
    public void testLeetCodeExample2() {
        int input = 7;
        int expected = 0;
        ComplementBaseTenInteger r = new ComplementBaseTenInteger();
        int actual = r.bitwiseComplement(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 3:
        Input: n = 10
        Output: 5
        Explanation: 10 is "1010" in binary, with complement "0101" in binary, which is 5 in base-10.
     */
    @Test
    public void testLeetCodeExample3() {
        int input = 10;
        int expected = 5;
        ComplementBaseTenInteger r = new ComplementBaseTenInteger();
        int actual = r.bitwiseComplement(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}