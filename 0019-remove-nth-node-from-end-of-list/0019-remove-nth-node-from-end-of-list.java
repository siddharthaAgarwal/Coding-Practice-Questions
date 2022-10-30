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

    public ListNode removeNthFromEnd(ListNode A, int B) {
        ListNode fast = A;

        if (B <= 0) return A;

        if (A == null) return A;

        for (int i = 0; i < B; i++) {
            if (fast.next == null) return A.next;
            fast = fast.next;
        }

        ListNode slow = A;

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return A;
    }
}
