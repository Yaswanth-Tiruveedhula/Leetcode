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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode pre=dummy;
        while(cur!=null&&cur.next!=null){
            System.out.println(cur.val);
            if(cur.val==cur.next.val){
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                pre.next=cur.next;
            }else{
                pre=pre.next;
            }
            cur=cur.next;
        }
        return dummy.next;
    }
}