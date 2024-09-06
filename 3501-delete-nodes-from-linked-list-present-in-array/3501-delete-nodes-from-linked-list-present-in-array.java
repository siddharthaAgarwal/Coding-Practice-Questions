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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i: nums)
        {
            set.add(i);
        }

         ListNode head1 = new ListNode(-1);
         head1.next=head;

        ListNode temp = head1;
         while(temp.next!=null)
         {
            if(set.contains(temp.next.val))
            {
                temp.next= temp.next.next;
            }
            else 
            temp = temp.next;
         }

         return head1.next;
        
    }
}