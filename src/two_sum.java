// https://leetcode-cn.com/problems/two-sum/submissions/
import java.util.HashMap;
import java.util.Map;

public class two_sum {
    public static void main(String[] args){
        int[] testCase = {2, 7, 11, 15};
        twoSum(testCase, 9);
    }

    // 方法1： 暴力双循环 时间on2 空间o1
    // 方法2： Map      时间o1 空间on
    public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer targetKey = target-nums[i];
            if(map.containsKey(targetKey)){
                return new int[]{ map.get(targetKey),i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
        
    }
}