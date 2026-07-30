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
        int length = 0;
        ListNode temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }
        int pos = length - n + 1;
         if(head == null){
            return head;
        }
        if(pos == 1){
             temp = head;
            head = head.next;
            return head;
        }
       
         temp = head;
        int count = 0;
        ListNode prev = null;
        while(temp != null){
            count++;
            if(count == pos){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
           
        }
        return head;
    }
}