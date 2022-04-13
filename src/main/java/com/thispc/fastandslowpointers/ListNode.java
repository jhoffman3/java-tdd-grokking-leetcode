package com.thispc.fastandslowpointers;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ListNode {

    private int value;
    private ListNode next;

}
