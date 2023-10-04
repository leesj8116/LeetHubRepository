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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return calAdd(l1, l2, 0);
    }

    public ListNode calAdd(ListNode l1, ListNode l2, int overTen) {
        if (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + overTen;
            return new ListNode(sum % 10, calAdd(l1.next, l2.next, sum / 10));
        }
        if(l1 == null && l2 == null) {
            return overTen == 1 ? new ListNode(1) : null;
        } else if (l1 != null) {
            int sum = l1.val + overTen;
            return new ListNode(sum % 10, calAdd(l1.next, null, sum / 10));
        } else {
            int sum = l2.val + overTen;
            return new ListNode(sum % 10, calAdd(null, l2.next, sum / 10));
        }
    }
}