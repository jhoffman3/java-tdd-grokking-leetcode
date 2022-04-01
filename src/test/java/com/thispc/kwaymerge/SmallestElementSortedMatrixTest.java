package com.thispc.kwaymerge;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/*
    378. Kth Smallest Element in a Sorted Matrix

    Given an n x n matrix where each of the rows and columns is sorted in ascending order,
    return the kth smallest element in the matrix.

    Note that it is the kth smallest element in the sorted order, not the kth distinct
     element.

    You must find a solution with a memory complexity better than O(n2).

    Constraints:

    n == matrix.length == matrix[i].length
    1 <= n <= 300
    -10^9 <= matrix[i][j] <= 10^9
    All the rows and columns of matrix are guaranteed to be sorted in non-decreasing order.
    1 <= k <= n^2
 */
public class SmallestElementSortedMatrixTest {

    /*
        Example 1:

        Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
        Output: 13
        Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
     */
    @Test
    public void testLeetCodeExample1() {
        int[][] matrix = new int[][]{ {1,5,9}, {10,11,13} , {12,13,15} };
        int target = 8;
        int expected = 13;
        SmallestElementSortedMatrix r = new SmallestElementSortedMatrix();
        int actual = r.kthSmallest(matrix, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: matrix = [[-5]], k = 1
        Output: -5
     */
    @Test
    public void testLeetCodeExample2() {
        int[][] matrix = new int[][]{ {-5} };
        int target = 1;
        int expected = -5;
        SmallestElementSortedMatrix r = new SmallestElementSortedMatrix();
        int actual = r.kthSmallest(matrix, target);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}