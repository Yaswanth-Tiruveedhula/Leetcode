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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=head,tail=head;
        int n=0;
        while(mid!=null){
            n++;
            mid=mid.next;
        }
        mid=head;
        while(tail!=null&&tail.next!=null){
            mid=mid.next;
            tail=tail.next.next;
            // n+=2;
        }
         if(head==mid) return true;
        Stack<Integer> st=new Stack();
        while(head!=mid){
            st.push(head.val);
            head=head.next;
        }
        if(n%2!=0){
            mid=mid.next;
        }
        while(mid!=null){
            int k=st.pop();
            if(k!=mid.val){
                return false;
            }
            mid=mid.next;
        }
        return st.size()==0;

    }
}