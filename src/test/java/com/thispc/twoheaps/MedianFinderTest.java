package com.thispc.twoheaps;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    295. Find Median from Data Stream

    The median is the middle value in an ordered integer list. If the size of the
    list is even, there is no middle value and the median is the mean of the two
     middle values.

    For example, for arr = [2,3,4], the median is 3.
    For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
    Implement the MedianFinder class:

    MedianFinder() initializes the MedianFinder object.
    void addNum(int num) adds the integer num from the data stream to the data
    structure.

    double findMedian() returns the median of all elements so far.
    Answers within 10-5 of the actual answer will be accepted.

    Constraints:

    -10^5 <= num <= 10^5

    There will be at least one element in the data structure before calling
    findMedian.

    At most 5 * 10^4 calls will be made to addNum and findMedian.
 */
public class MedianFinderTest {

    // given the constraints, no argument validation test was written

    /*
        Example 1:

        Input
        ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
        [[], [1], [2], [], [3], []]
        Output
        [null, null, null, 1.5, null, 2.0]

        Explanation
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        medianFinder.findMedian(); // return 2.0
     */
    @Test
    public void testLeetCodeExample1Part1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        double expected = 1.5;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);

    }

    @Test
    public void testLeetCodeExample1Part2() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        medianFinder.addNum(3);    // arr = [1, 2, 3]
        double expected = 2.0;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        For example, for arr = [2,3,4], the median is 3.
     */
    @Test
    public void testLeetCodeExample2() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        double expected = 3.0;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
     */
    @Test
    public void testLeetCodeExample3() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        double expected = 2.5;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testMany() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(2);
        medianFinder.addNum(3);
        medianFinder.addNum(4);
        medianFinder.addNum(5);
        medianFinder.addNum(6);
        double expected = 4;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testOne() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(-1);
        double expected = -1;
        double actual = medianFinder.findMedian();
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}