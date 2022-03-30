package com.thispc.kwaymerge;

import java.util.Objects;

public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode sortedList = null;

        if (Objects.isNull(lists) || lists.length == 0) {
            sortedList = new ListNode();
            return sortedList;
        }

        for(ListNode list: lists) {
            sortedList = merge(sortedList, list);
        }
        return sortedList;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        if(l1.getVal() < l2.getVal()) {
            l1.setNext(merge(l1.getNext(), l2));
            return l1;
        } else {
            l2.setNext(merge(l1, l2.getNext()));
            return l2;
        }
    }
}
