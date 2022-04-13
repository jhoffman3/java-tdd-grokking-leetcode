package com.thispc.fastandslowpointers;

import org.assertj.core.api.Assertions;
import org.junit.Test;

/**
 * 142. Linked List Cycle II
 * <p>
 * Given the head of a linked list, return the node where the cycle begins. If
 * there is no cycle, return null.
 * <p>
 * There is a cycle in a linked list if there is some node in the list that can
 * be reached again by continuously following the next pointer. Internally, pos
 * is used to denote the index of the node that tail's next pointer is connected
 * to (0-indexed). It is -1 if there is no cycle. Note that pos is not passed as
 * a parameter.
 * <p>
 * Do not modify the linked list.
 * <p>
 * Constraints:
 * <p>
 * The number of the nodes in the list is in the range [0, 10^4]. -10^5 <=
 * Node.val <= 10^5 pos is -1 or a valid index in the linked-list.
 */
public class LinkedListCycle2Test {

    /*
     * Example 1:
     *
     *
     * Input: head = [3,2,0,-4], pos = 1
     * Output: tail connects to node index 1
     * Explanation: There is a cycle in the linked list, where tail connects to the second node.
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

        ListNode expected = node2;
        LinkedListCycle2 r = new LinkedListCycle2();
        ListNode actual = r.detectCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
     * Example 2:
     *
     * Input: head = [1,2], pos = 0
     * Output: tail connects to node index 0
     * Explanation: There is a cycle in the linked list, where tail connects to the first node.
     */
    @Test
    public void testLeetCodeExample2() {
        ListNode head = ListNode.builder().value(1).build();
        ListNode node2 = ListNode.builder().value(2).build();
        head.setNext(node2);
        node2.setNext(head);

        ListNode expected = head;
        LinkedListCycle2 r = new LinkedListCycle2();
        ListNode actual = r.detectCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
     * Example 3:
     *
     * Input: head = [1], pos = -1
     * Output: no cycle
     * Explanation: There is no cycle in the linked list.
     */
    @Test
    public void testLeetCodeExample3() {
        ListNode head = ListNode.builder().value(1).build();

        ListNode expected = null;
        LinkedListCycle2 r = new LinkedListCycle2();
        ListNode actual = r.detectCycle(head);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

}