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

    // ListNode createListOfSize(ListNode head, int k) {

    // }

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        int n = 0;
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        ListNode[] res = new ListNode[k];

        for (int i = 0; i < k; i++) {
            int size = (n / k) + (n % k - i > 0 ? 1 : 0);
           // System.out.println(size);

            res[i] = head;
            while (head != null && size != 0) {
                if (size == 1) {
                    temp = head;
                    head = head.next;
                    temp.next = null;
                } else {
                    head = head.next;
                }
                size--;
            }
        }
        return res;
    }
}
