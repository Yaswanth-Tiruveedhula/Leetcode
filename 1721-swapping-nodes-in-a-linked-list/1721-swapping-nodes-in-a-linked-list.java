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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow=head,fast=head;
        for(int i=1;i<k;i++){
            fast=fast.next;
        }
        ListNode temp=fast;
        fast=fast.next;
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        int ele=slow.val;
        slow.val=temp.val;
        temp.val=ele;
        return head;
        // int l=1;
        // ListNode temp=head;
        // while(fast!=null&&fast.next!=null){
            
        //     if(l==k){
        //         temp=slow;
        //     }
        //     slow=slow.next;
        //     fast=fast.next.next;
        //     l++;
        // }
        // // if(l==k);
        // System.out.println(temp.val);
        // System.out.println(l);
        // if(fast==null){
        //     l--;
        //     // slow=slow.next;
        // }
        // fast=head;
        // while(slow!=null){

        //     if(l==k){
        //         break;
        //     }                
        //     l--;
        //     slow=slow.next;
        // }
        // System.out.println(slow.val);
        // int val=slow.val;
        // slow.val=temp.val;
        // temp.val=val;
        // return head;
    }
}