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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)     return head;
        ListNode cur=head,pre=head;
        int l=1;
        pre=null;
        while(cur.next!=null){
            l++;
            cur=cur.next;
        }
        ListNode temp=cur;
        k%=l;
        if(k==0)    return head;
        cur=head;
        for(int i=1;i<l-k+1;i++){
            if(pre==null){
                pre=head;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        pre.next=null;
        // cur.next=head;
        temp.next=head;
        head=cur;
        //  head=temp.next;
        // System.out.println(k+" "+l);
        return head;
    }
}