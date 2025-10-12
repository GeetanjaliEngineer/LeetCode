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
        //logic - approach - Two pointer approacch 
        //slow and fast pointer on head [1,1,2]
        //base case if  head == null = return null 
        //slow and fast moves one by one 
        // if fast.val != slow.val.. slow.next = fast  and slow to fast -- move
        // slow.next = null to cut remaning duplicates
        //base case 
        if(head == null) return null;
         ListNode slow =head;
         ListNode fast =head;

         while(fast != null){
            if(slow.val != fast.val){
                //move ahead
                slow.next=fast;
                slow=slow.next;
            }
            fast=fast.next; // fast+1
         }
         //null to cut duplicates
         slow.next = null;
         return head;

    }
}
