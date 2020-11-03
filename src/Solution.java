/**
 * Definition for singly-linked list.
 *
 */
class Solution {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String[] args) {
        Thread a = new Runnable(()-{

        });
        ListNode temp = new ListNode(1);
        ListNode temp1 = new ListNode(2);
        temp.next=temp1;
        ListNode temp2 = new ListNode(3);
        temp1.next=temp2;
        ListNode temp3 = new ListNode(4);
        temp2.next=temp3;
        ListNode temp4 = new ListNode(5);
        temp3.next=temp4;
        temp4.next=null;
        reverseList(temp);
    }
    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return null;
        ListNode tail = new ListNode(head.val);
        tail.next = null;
        head = head.next;
        while (head!=null ){
            ListNode temp = new ListNode(head.val);
            temp.next = tail;
            tail = temp;
            head = head.next;
        }
        return tail;
    }
}