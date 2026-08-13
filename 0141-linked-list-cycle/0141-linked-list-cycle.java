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
public class Solution {// flyod cycle is algo for finding whether there is cycle is present or not by using fast and slow pointers if they ever meet at a point then its confirmed that cycle exists
    public boolean hasCycle(ListNode head) {
         ListNode slow = head;
    ListNode fast = head;

    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (fast == slow) {
            return true;
        }
    }

    return false;
    }
}