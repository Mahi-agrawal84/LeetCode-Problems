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
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        return sol(head);
        
    }
    public ListNode sol(ListNode head)
    {
        if(head==null)return null;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
            {
                int cnt=getcnt(fast);
                ListNode temp=head;
                int idx=0;
                while(cnt>idx)
                {
                    temp=temp.next;
                    idx++;
                }
                while(temp!=head)
                {
                    temp=temp.next;
                    head=head.next;
                }
                return temp;
            }
        }
        return null;
    }
    public int getcnt(ListNode fast)
    {
        ListNode temp=fast.next;
        int cnt=1;
        while(temp!=fast)
        {
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
}