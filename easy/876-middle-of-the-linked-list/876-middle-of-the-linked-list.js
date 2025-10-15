/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */

// fast solution through two pointers
var middleNode = function(head) {
    let slow = head
    let fast = head
    while(fast != null && fast.next != null){
        slow = slow.next
        fast = fast.next.next
    }
    return slow
};

// simple solution through calculating length of linked list
var middleNode = function(head) {
    let pointer = head
    let length = 0;
    while(pointer != null){
        pointer = pointer.next
        length ++
    }

    middle_index = length /2

    pointer = head

    for(let i = 1; i<=middle_index; i++){
        pointer = pointer.next
    }
    return pointer
};