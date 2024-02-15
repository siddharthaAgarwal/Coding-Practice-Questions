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
    
    
    int gcd(int a, int b)
    {
        if(a==b)
        {
            return a;
        }
        else if(a>b)
        {
            return gcd(a-b,b);
        }
        return gcd(b,a);
    }
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode root=head;
        while(head!=null && head.next!=null)
        {
            ListNode temp= head.next;
            head.next= new ListNode(gcd(head.val, temp.val));
            head.next.next=temp;
            head=temp;
        }
        return root;
        
    }
}