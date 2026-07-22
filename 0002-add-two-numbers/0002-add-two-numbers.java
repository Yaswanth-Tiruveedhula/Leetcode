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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int cont=0;
        ListNode ret=l1;
        ListNode head=null;
        ListNode tail=null;
        while(l1!=null&&l2!=null){
            int sum=cont+l1.val+l2.val;
            if(sum>9){
                cont=sum/10;
                sum%=10;
            }else cont=0;
            ListNode now=new ListNode(sum);
            if(head!=null){
                head.next=now;
                head=now;
            }else{
                tail=now;
                head=now;
            }
            // l1.val=sum;
            // l2.val=sum;
            l1=l1.next;
            l2=l2.next;
        }
        // if(l1==null&&l2==null)  return tail;
        while(l1!=null){
            cont+=l1.val;
            ListNode now=new ListNode(cont%10);
            if(head!=null){
                head.next=now;
                head=now;
            }else{
                head=now;
            }
            // l1.val=cont%10;
            cont/=10;
            l1=l1.next;
        }
        while(l2!=null){
            cont+=l2.val;
            ListNode now=new ListNode(cont%10);
            if(head!=null){
                head.next=now;
                head=now;
            }else{
                head=now;
            }
            cont/=10;
            // l2.val=cont%10;
            // cont=cont<10?0:cont/10;
            l2=l2.next;
        }
        System.out.println(cont);
        if(cont!=0){
            ListNode now=new ListNode(cont,null);
            head.next=now;
        }
        return tail;
    }
}