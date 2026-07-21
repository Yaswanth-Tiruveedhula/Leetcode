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
    public ListNode middleNode(ListNode head) {
        ListNode mid=head,tail=head;
        while(tail!=null&&tail.next!=null){
            mid=mid.next;
            tail=tail.next.next;
        }
        return mid;
    }
}