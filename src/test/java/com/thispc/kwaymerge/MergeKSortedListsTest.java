package com.thispc.kwaymerge;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static com.thispc.util.TestUtils.printRecursive;

/*
    23. Merge k Sorted Lists

    You are given an array of k linked-lists lists, each linked-list is sorted in
    ascending order.

    Merge all the linked-lists into one sorted linked-list and return it.

    Constraints:

    k == lists.length
    0 <= k <= 10^4
    0 <= lists[i].length <= 500
    -10^4 <= lists[i][j] <= 10^4
    lists[i] is sorted in ascending order.
    The sum of lists[i].length will not exceed 10^4.
 */
public class MergeKSortedListsTest {

    /*
        Example 1:

        Input: lists = [[1,4,5],[1,3,4],[2,6]]
        Output: [1,1,2,3,4,4,5,6]
        Explanation: The linked-lists are:
        [
          1->4->5,
          1->3->4,
          2->6
        ]
        merging them into one sorted list:
        1->1->2->3->4->4->5->6
     */
    @Test
    public void testLeetCodeExample1() {
        ListNode first = ListNode.builder()
            .val(1).next(
                ListNode.builder().val(4).next(
                    ListNode.builder().val(5).build()
                ).build()
            ).build();

        ListNode second = ListNode.builder()
            .val(1).next(
                ListNode.builder().val(3).next(
                    ListNode.builder().val(4).build()
                ).build()
            ).build();
        ListNode third = ListNode.builder()
            .val(2).next(
                ListNode.builder().val(6).build()
            ).build();

        ListNode[] input = new ListNode[]{first, second, third};

        ListNode expected = ListNode.builder()
            .val(1).next(
                ListNode.builder().val(1).next(
                    ListNode.builder().val(2).next(
                        ListNode.builder().val(3).next(
                            ListNode.builder().val(4).next(
                                ListNode.builder().val(4).next(
                                    ListNode.builder().val(5).next(
                                        ListNode.builder().val(6).build()
                                    ).build()
                                ).build()
                            ).build()
                        ).build()
                    ).build()
                ).build()
            ).build();

        MergeKSortedLists r = new MergeKSortedLists();
        ListNode actual = r.mergeKLists(input);

//        System.out.println("actual: ");
//        printRecursive(actual);
//        System.out.println("expected: ");
//        printRecursive(expected);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    /*
        Example 2:

        Input: lists = []
        Output: []
     */
    @Test
    public void testLeetCodeExample2() {
        ListNode[] input = new ListNode[]{};
        ListNode expected = new ListNode();
        MergeKSortedLists r = new MergeKSortedLists();
        ListNode actual = r.mergeKLists(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
    /*
        Example 3:

        Input: lists = [[]]
        Output: []
     */
    @Test
    public void testLeetCodeExample3() {
        ListNode[] input = new ListNode[]{new ListNode()};
        ListNode expected = new ListNode();
        MergeKSortedLists r = new MergeKSortedLists();
        ListNode actual = r.mergeKLists(input);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}