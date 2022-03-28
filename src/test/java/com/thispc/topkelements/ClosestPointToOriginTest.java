package com.thispc.topkelements;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    973. K Closest Points to Origin

    Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane and an integer k, return the
    k closest points to the origin (0, 0).

    The distance between two points on the X-Y plane is the Euclidean distance (i.e., √(x1 - x2)2 + (y1 - y2)2).

    You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in).

    Constraints:

    1 <= k <= points.length <= 10^4
    -10^4 < x, y < 10^4
 */
public class ClosestPointToOriginTest {

    /*
        Input: points = [[1,3],[-2,2]], k = 1
        Output: [[-2,2]]
        Explanation:
        The distance between (1, 3) and the origin is sqrt(10).
        The distance between (-2, 2) and the origin is sqrt(8).
        Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
        We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
     */
    @Test
    public void testLeetCodeExample1() {
        int[][] nums = new int[][]{{1,3},{-2,2}};
        int target = 1;
        int[][] expected = {{-2,-2}};
        ClosestPointToOrigin r = new ClosestPointToOrigin();
        int[][] actual = r.kClosest(nums, target);
        Assertions.assertThat(actual).hasSameDimensionsAs(expected);
    }
    /*
        Example 2:

        Input: points = [[3,3],[5,-1],[-2,4]], k = 2
        Output: [[3,3],[-2,4]]
        Explanation: The answer [[-2,4],[3,3]] would also be accepted.
     */
    @Test
    public void testLeetCodeExample2() {
        int[][] nums = new int[][]{{3,3},{5,-1},{-2,4}};
        int target = 2;
        int[][] expected = {{-2,4},{3,3}};
        ClosestPointToOrigin r = new ClosestPointToOrigin();
        int[][] actual = r.kClosest(nums, target);
        Assertions.assertThat(actual).hasSameDimensionsAs(expected);
    }
}