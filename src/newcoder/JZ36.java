package newcoder;


import java.util.HashMap;

public class JZ36 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap tmp= new HashMap();
        while (pHead1!=null){
            tmp.put(pHead1.val,0);
            pHead1=pHead1.next;
        }
        while (pHead2!=null){
            if (tmp.get(pHead2.val)!=null){
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        JZ36 solution = new JZ36();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(3);
        System.out.println(solution.FindFirstCommonNode(node1, node2).val);
    }
}