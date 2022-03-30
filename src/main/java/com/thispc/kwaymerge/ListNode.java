package com.thispc.kwaymerge;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Builder
@EqualsAndHashCode
@Getter
@Setter
public class ListNode {

    private int val;
    private ListNode next;

    public ListNode() {
        //intentionally blank
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
