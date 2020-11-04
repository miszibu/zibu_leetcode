package newcoder;


public class JZ36_1 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        while (pHead1!=null){
            ListNode tmp = pHead2;
            while (tmp!=null){
                if (tmp.val == pHead1.val){
                    return tmp;
                }
                tmp=tmp.next;
            }
            pHead1=pHead1.next;
        }
        return null;
    }

    public static void main(String[] args) {
        JZ36_1 solution = new JZ36_1();
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(3);
        System.out.println(solution.FindFirstCommonNode(node1,node2));
    }
}
