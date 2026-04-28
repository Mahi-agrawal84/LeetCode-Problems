/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        return sol(head);
        
    }
    public boolean sol(ListNode head)
    {
        ListNode slow=head;
        ListNode fast=head;
        boolean flag=true;
        while(fast!=null && fast.next!=null)
        {
            if(slow==fast)
            {
                if(slow==fast && flag==false)
                {
                    return true;

                }
                flag= false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false ;
    }
}