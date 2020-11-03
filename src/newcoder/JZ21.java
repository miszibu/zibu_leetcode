package newcoder;


import java.util.ArrayList;
import java.util.Comparator;

// 题号：
// 题目名称：栈的压入，弹出序列
// 题目要求：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。
// 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
// 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

public class JZ21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> knownList = new ArrayList<>(popA.length);
        for (int i = 0; i < popA.length; i++) {
            int currPos = -1;
            for (int j = 0; j < pushA.length; j++) {
                if (pushA[j]==popA[i]){
                    currPos = j;
                    break;
                }
            }
            if (currPos<0){
                return false;
            }
            if (knownList.size()!=0){
                if (knownList.get(0) >currPos){
                    if (getNextSmallerPos(knownList)!=currPos){
                        return false;
                    }
                }
            }
            knownList.add(currPos);
            knownList.sort(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2-o1;
                }
            });


        }
        return true;
    }

    private int getNextSmallerPos(ArrayList<Integer> positionList){
        if (positionList.size()==0){
            return -1;
        }else if (positionList.size()==1){
            return positionList.get(0)-1;
        }else{
            for (int i = 1; i < positionList.size(); i++) {
                if (positionList.get(i-1) - positionList.get(i)==1){
                    continue;
                }
                return positionList.get(i)+1;
            }
        }
        return positionList.get(positionList.size()-1)-1;

    }

    public static void main(String[] args) {
        JZ21 solution = new JZ21();
        int [] push = {1, 2, 3};
        int [] pop = { 3, 1 ,2};
        System.out.println(solution.IsPopOrder(push, pop));
    }
}
