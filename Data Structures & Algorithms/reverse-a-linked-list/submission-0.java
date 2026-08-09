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
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode ant = null;
        ListNode atual = head;
        ListNode prox = head;

        while(atual != null) {
            prox = prox.next;
            atual.next = ant;
            ant = atual;
            atual = prox;
        }
        return ant;
    }
}
