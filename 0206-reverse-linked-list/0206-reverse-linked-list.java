
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode curr = null;
        while(head!=null){
            ListNode temp = head.next;
            head.next = curr;
            curr = head;
            head = temp;
        }
        return curr;
    }
}