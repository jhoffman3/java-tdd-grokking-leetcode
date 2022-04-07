package com.thispc.topologicalsort;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 207. Course Schedule
 * <p>
 * There are a total of numCourses courses you have to take, labeled from 0 to
 * numCourses - 1. You are given an array prerequisites where prerequisites[i] =
 * [ai, bi] indicates that you must take course bi first if you want to take
 * course ai.
 * <p>
 * For example, the pair [0, 1], indicates that to take course 0 you have to
 * first take course 1.
 * <p>
 * Return true if you can finish all courses. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * 1 <= numCourses <= 10^5 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2 0 <= ai, bi < numCourses All the pairs
 * prerequisites[i] are unique.
 */
public class CourseScheduleTest {

    /*
        Example 1:

        Input: numCourses = 2, prerequisites = [[1,0]]
        Output: true
        Explanation: There are a total of 2 courses to take.
        To take course 1 you should have finished course 0. So it is possible.
     */
    @Test
    public void testLeetCodeExample1() {
        int[][] prereqs = new int[][]{{1,0}};
        int numCourses = 2;
        boolean expected = true;
        CourseSchedule r = new CourseSchedule();
        boolean actual = r.canFinish(numCourses, prereqs);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /*
        Example 2:

        Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
        Output: false
        Explanation: There are a total of 2 courses to take.
        To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
     */
    @Test
    public void testLeetCodeExample2() {
        int[][] prereqs = new int[][]{{1,0},{0,1}};
        int numCourses = 2;
        boolean expected = false;
        CourseSchedule r = new CourseSchedule();
        boolean actual = r.canFinish(numCourses, prereqs);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}