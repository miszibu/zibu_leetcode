package newcoder;


public class JZ36_2 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) {
            return null;
        }
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
            if (p1 != p2) {
                if (p1 == null) {
                    p1 = pHead2;
                }
                if (p2 == null) {
                    p2 = pHead1;
                }
            }
        }
        return p1;
    }

    public static void main(String[] args) {
        JZ36_2 solution = new JZ36_2();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(3);
        System.out.println(solution.FindFirstCommonNode(node1, node2).val);
    }
}