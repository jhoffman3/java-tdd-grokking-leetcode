package com.thispc.fastandslowpointers;

import java.util.Objects;

public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {

        if (Objects.isNull(head) || Objects.isNull(head.getNext())) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        boolean hasCycle = false;
        while(Objects.nonNull(fast) && Objects.nonNull(fast.getNext())) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (Objects.equals(slow, fast)) {
                break;
            }
        }

        if (Objects.isNull(fast) || Objects.isNull(fast.getNext())) {
            return null;
        }

        ListNode result = head;
        while(result != slow) {
            result = head.getNext();
            slow = slow.getNext();
        }
        return result;
    }
}
