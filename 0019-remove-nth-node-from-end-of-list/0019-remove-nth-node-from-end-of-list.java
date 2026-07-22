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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;

        }
        if(n==len)  return head.next;
        if(len==1) return null;
        temp=head;
        while(temp!=null){
            // len--;/
            if(len==n+1){
                // if()
                temp.next=temp.next.next;
                return head;
            }
            temp=temp.next;
            len--;
        }
        System.out.println(len);
        return head;
    }
}