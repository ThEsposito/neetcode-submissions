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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode cur = head;

        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                cur.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                cur.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            cur = cur.next;
        }

        while(list1 != null) {
            cur.next = new ListNode(list1.val);
            list1 = list1.next; // node.next = list1; could modify the original lists


            cur = cur.next;
        }

        while(list2 != null) {
            cur.next = new ListNode(list2.val);
            list2 = list2.next;
            cur = cur.next;
            
        }
        return head.next;
    }
}