/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // HashMap<ListNode,Integer> map = new HashMap<>();
        // ListNode temp = head;
        // while(temp != null){
        //    if(!map.containsKey(temp)){
        //     map.put(temp,map.getOrDefault(temp,0)+1);
        //    }
        //    else{
        //     return true;
        //    }
        //    temp = temp.next;
        // }
        // return false;

        HashSet<ListNode>set = new HashSet<>();
        ListNode temp = head;
        while(temp != null){
            if(set.contains(temp)){
                return true;
            }
            set.add(temp);
            temp = temp.next;
        }
        return false;

    }
}