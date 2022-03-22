package com.thispc.modifiedbinarysearch;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
744. Find Smallest Letter Greater Than Target

Given a characters array letters that is sorted in non-decreasing
order and a character target, return the smallest character
in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'],
the answer is 'a'.

Constraints:

2 <= letters.length <= 10^4
letters[i] is a lowercase English letter.
letters is sorted in non-decreasing order.
letters contains at least two different characters.
target is a lowercase English letter.
 */
public class NextGreatestLetterTest {
    /*
        Example 1:

        Input: letters = ["c","f","j"], target = "a"
        Output: "c"
     */
    @Test
    public void testLeetCodeExample1() {
        char[] input = new char[]{'c','f','j'};
        char target = 'a';
        char expected = 'c';
        NextGreatestLetter r = new NextGreatestLetter();
        char actual = r.nextGreatestLetter(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: letters = ["c","f","j"], target = "c"
        Output: "f"
     */
    @Test
    public void testLeetCodeExample2() {
        char[] input = new char[]{'c','f','j'};
        char target = 'c';
        char expected = 'f';
        NextGreatestLetter r = new NextGreatestLetter();
        char actual = r.nextGreatestLetter(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /*
        Example 3:

        Input: letters = ["c","f","j"], target = "d"
        Output: "f"
     */
    @Test
    public void testLeetCodeExample3() {
        char[] input = new char[]{'c','f','j'};
        char target = 'd';
        char expected = 'f';
        NextGreatestLetter r = new NextGreatestLetter();
        char actual = r.nextGreatestLetter(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
    from comments doesn't work for cfj target g
     */
    @Test
    public void testLeetCodeExample4() {
        char[] input = new char[]{'c','f','j'};
        char target = 'g';
        char expected = 'j';
        NextGreatestLetter r = new NextGreatestLetter();
        char actual = r.nextGreatestLetter(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        For example, if target == 'z' and letters == ['a', 'b'],
        the answer is 'a'.
     */
    @Test
    public void testLeetCodeExample5() {
        char[] input = new char[]{'a', 'b'};
        char target = 'z';
        char expected = 'a';
        NextGreatestLetter r = new NextGreatestLetter();
        char actual = r.nextGreatestLetter(input, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}