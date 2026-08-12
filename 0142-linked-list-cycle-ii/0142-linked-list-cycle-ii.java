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
public class Solution {// flyod cycle detection with fast and slow and phase two to find if cycle is there then we have to get where the cycle start from Time: O(n)
//Extra space: O(1)

    public ListNode detectCycle(ListNode head) {
     
        ListNode slow = head;
        ListNode fast = head;

        // Phase 1: detect cycle
        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Phase 2: find cycle entrance
                ListNode ptr = head;
                while (ptr != slow) {
                    ptr = ptr.next;
                    slow = slow.next;
                }
                return ptr;
            }
        }
        return null;
    
    }
}