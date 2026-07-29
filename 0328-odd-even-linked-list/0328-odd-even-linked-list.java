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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer>odd = new ArrayList<>();
        ArrayList<Integer>even = new ArrayList<>();
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            if(count%2 != 0 ){
                odd.add(temp.val);
            }
            else{
                even.add(temp.val);
            }
            temp = temp.next;
        }
        temp = head;
       
        for(int i = 0;i<odd.size();i++){
            temp.val = odd.get(i);
            temp = temp.next;
        }
       
        
        
        for(int i = 0;i<even.size();i++){
            temp.val = even.get(i);
            temp = temp.next;
        }
        
        
        return head;
    }
}