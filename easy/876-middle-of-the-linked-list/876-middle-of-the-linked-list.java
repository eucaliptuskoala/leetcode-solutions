// public class ListNode {
//     int val;
//     ListNode next;
//     ListNode() {}
//     ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }

// fast solution through two pointers
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode slow = head;
//         ListNode fast = head;
//         while (fast != null && fast.next != null){
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }
// }

// simple solution through calculating length
// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode pointer = head;
//         int length = 0;
//         while(pointer != null){
//             pointer = pointer.next;
//             length ++;
//         }

//         int middle_index = length / 2;

//         pointer = head;
//         for(int i = 1; i<=middle_index; i++){
//             pointer = pointer.next;
//         }
//         return pointer;
//     }
// }