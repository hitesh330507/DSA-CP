/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

// @lc code=start

import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode prev=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast.next!=null){
            prev=slow;
            slow=slow.next;
        }
        prev.next=slow.next;
        return head;
    }
}
// @lc code=end

