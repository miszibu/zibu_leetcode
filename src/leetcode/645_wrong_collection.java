import java.util.BitSet;

// Question URL: https://leetcode-cn.com/problems/set-mismatch/

// 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。

// 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。


// 输入: nums = [1,2,2,4]
// 输出: [2,3]

// 注意:

// 给定数组的长度范围是 [2, 10000]。
// 给定的数组是无序的。
class wrong_collection {
    public static void main(String[] args){
       //Test Case 1：True
       int[] testCase = new int[]{1,2,2,4};
        
       //Test Case 2: False
    //    int[] testCase = new int[]{3,2,1,0,4};

        System.out.println(findErrorNums(testCase).toString());
    }
    
    // public static int[] findErrorNums(int[] nums) {
    //     Boolean[] bitMap = new Boolean[nums.length];
    //     int repeatNum = 0;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(bitMap[nums[i]-1]!=null && bitMap[nums[i]-1]){
    //             repeatNum = nums[i];
    //         }
    //         bitMap[nums[i]-1]=true;
    //     }
    //     for (int i = 0; i < bitMap.length; i++) {
    //         if(bitMap[i]==null){
    //             int[] output = new int[2];
    //             output[0]=repeatNum;
    //             output[1]=i+1;
    //             return output;
    //         }
    //     }
    //     return null;
    // }

    public static int[] findErrorNums(int[] nums) {
        BitSet bitMap = new BitSet(nums.length);
        int repeatNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(bitMap.get(nums[i]-1)){
                repeatNum = nums[i];
            }
            bitMap.set(nums[i]-1);
        }
        for (int i = 0; i < bitMap.size(); i++) {
            if(!bitMap.get(i)){
                int[] output = new int[2];
                output[0]=repeatNum;
                output[1]=i+1;
                return output;
            }
        }
        return null;
    }

}