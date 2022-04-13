package com.thispc.fastandslowpointers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 141. Linked List Cycle
 * <p>
 * Given head, the head of a linked list, determine if the linked list has a
 * cycle in it.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the next pointer. Internally, pos
 * is used to denote the index of the node that tail's next pointer is connected
 * to. Note that pos is not passed as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 10^4].
 * -10^5 <=
 * Node.val <= 10^5 pos is -1 or a valid index in the linked-list.
 */
public class LinkedListCycleTest {

    /*
     * Example 1:
     *
     *
     * Input: head = [3,2,0,-4], pos = 1
     * Output: true
     * Explanation: There is a cycle in the linked list, where the tail
     * connects to the 1st node (0-indexed).
     */
    @Test
    public void testLeetCodeExample1() {
        ListNode head = ListNode.builder().value(3).build();
        ListNode node2 = ListNode.builder().value(2).build();
        ListNode node3 = ListNode.builder().value(0).build();
        ListNode node4 = ListNode.builder().value(-4).build();
        head.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);

        boolean expected = true;
        LinkedListCycle r = new LinkedListCycle();
        boolean actual = r.hasCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
     * Example 2:
     *
     * Input: head = [1,2], pos = 0
     * Output: true
     * Explanation: There is a cycle in the linked list, where the
     * tail connects to the 0th node.

     */
    @Test
    public void testLeetCodeExample2() {
        ListNode head = ListNode.builder().value(1).build();
        ListNode node2 = ListNode.builder().value(2).build();
        head.setNext(node2);
        node2.setNext(head);

        boolean expected = true;
        LinkedListCycle r = new LinkedListCycle();
        boolean actual = r.hasCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
     * Example 3:
     *
     * Input: head = [1], pos = -1
     * Output: false
     * Explanation: There is no cycle in the linked list.
     */
    @Test
    public void testLeetCodeExample3() {
        ListNode head = ListNode.builder().value(1).build();

        boolean expected = false;
        LinkedListCycle r = new LinkedListCycle();
        boolean actual = r.hasCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}