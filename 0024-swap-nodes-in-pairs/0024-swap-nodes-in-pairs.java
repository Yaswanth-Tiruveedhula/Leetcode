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
    public ListNode swapPairs(ListNode head) {
        ListNode cur=head;
        if(head==null||head.next==null)  return head;
        ListNode let=new ListNode();
        ListNode snd=head.next;
        ListNode thr=snd.next;
        head=snd;
        while(cur!=null&&snd!=null){
            thr=snd.next;
            snd.next=cur;
            cur.next=thr;
            let.next=snd;
            if(thr!=null){
                let=cur;
                cur=thr;
                snd=thr.next;
            }else{
                break;
            }
        }
        return head;
        // while(cur!=null&&cur.next!=null){
        //     int val=cur.val;
        //     cur.val=cur.next.val;
        //     cur.next.val=val;
        //     cur=cur.next.next;
        // }
        // return head;
    }
}