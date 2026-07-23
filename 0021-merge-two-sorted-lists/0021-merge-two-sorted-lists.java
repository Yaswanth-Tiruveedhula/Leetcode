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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)     return list2;
        ListNode lst=new ListNode();
        ListNode fst=lst;
        ListNode pre=lst;
        if(list2==null)     return list1;
        while(list1!=null||list2!=null){
            int val1=list1!=null?list1.val:101;
            int val2=list2!=null?list2.val:101;
            if(val1<val2){
                // ListNode obj=new ListNode(val1);
                pre.next=list1;
                pre=list1;
                list1=list1.next;
            }else{
                // ListNode obj=new ListNode(val2);
                pre.next=list2;
                pre=list2;
                list2=list2.next;
            }
        }
        return fst.next;
    }
}