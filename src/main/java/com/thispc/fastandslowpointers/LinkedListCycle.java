package com.thispc.fastandslowpointers;

import java.util.Objects;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        if (Objects.isNull(head) || Objects.isNull(head.getNext())) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (Objects.nonNull(fast) && Objects.nonNull(fast.getNext())) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();

            if (Objects.equals(slow, fast)) {
                return true;
            }
        }

        return false;
    }
}
