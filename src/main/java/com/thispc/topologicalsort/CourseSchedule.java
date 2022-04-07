package com.thispc.topologicalsort;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Use Kahn's algorithm for topological sorting, which follows the following
 * rules:
 * <p>
 * 1. Let's say L will hold the list that with topologically sorted elements,
 * and S is a set of nodes with no incoming edges.
 * <p>
 * 2. For a node n in S, append to L. For each outgoing edge of n that points to
 * m, remove that edge. If m has no incoming edges anymore, add to S.
 * <p>
 * 3. Remove n and all outgoing edges of n from the graph.
 * <p>
 * 4. Do this until S is empty.
 * <p>
 * 5. If edges still exist in the graph. There is a cycle. If else, L will have
 * all the elements sorted in topological order.
 * <p>
 * If we fit Kahn's algorithm into our own problem, we can write something like
 * the code below. Since we just want to see if there is a cycle in the tree,
 * all we have to do is keep track of how many edges we have left.
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if (numCourses < 2) {
            return true;
        }

        int[] incomingEdges = new int[numCourses];
        List<Integer>[] relationships = new List[numCourses];

        for (int i = 0; i < numCourses; i++) {
            relationships[i] = new LinkedList<>();
        }
        for (int[] prerequisite : prerequisites) {
            incomingEdges[prerequisite[0]]++;
            relationships[prerequisite[1]].add(prerequisite[0]);
        }

        Queue<Integer> noIncomingEdges = new LinkedList<>();
        int totalEdgeCount = 0;
        for (int i = 0; i < numCourses; i++) {
            if (incomingEdges[i] == 0) {
                noIncomingEdges.add(i);
            }
            totalEdgeCount += incomingEdges[i];
        }

        while (!noIncomingEdges.isEmpty()) {
            int courseNum = noIncomingEdges.poll();
            for (int nextCourse : relationships[courseNum]) {
                if (--incomingEdges[nextCourse] == 0) {
                    noIncomingEdges.add(nextCourse);
                }
                totalEdgeCount--;
            }
        }

        return totalEdgeCount == 0;
    }
}