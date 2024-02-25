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
        
       Stack<ListNode> stack = new Stack<>();
        
        while(head!=null)
        {
            stack.push(head);
            head= head.next;
        }
        
        Boolean flag= true;
        ListNode newHead = null, temp=null;
        while(!stack.empty())
        {
            if(flag)
            {
                newHead = stack.pop();
                temp=newHead;
                flag= false;
            }
            else
            {
                temp.next= stack.pop();
                temp=temp.next;
            }
        }
        
        if(!flag)
        temp.next=null;
        return newHead;
        
        
    }
    
//     a. b. null
//     1->2
// head1 head2        

//   temp.next = head; 
//     head.next= head.next.next
    
    
    
    
}