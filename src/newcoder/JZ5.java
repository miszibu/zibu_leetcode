package newcoder;

import java.util.Stack;

// 题目名称：用两个栈实现队列
// 题目要求：用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class JZ5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {

        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int temp =stack2.pop();
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return temp;

    }

    public static void main(String[] args) {
        JZ5 solution = new JZ5();
        solution.push(0);
        solution.push(1);
        solution.push(2);
        System.out.println(solution.pop());
    }
}
