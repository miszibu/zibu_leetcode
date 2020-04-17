// Question URL: https://leetcode-cn.com/problems/jump-game/

// 解题思路: 
// 注意的是，此处问题，我一开始没读懂。是nums[0]出发，nums[0]的数值则代表着所能跳的最远的举例，就是能跳1-N格子。

// 输入: [2,3,1,1,4]
// 输出: true
// 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。

// 输入: [3,2,1,0,4]
// 输出: false
// 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。

class jump_game {
    public static void main(String[] args){
       //Test Case 1：True
       int[] testCase = new int[]{2,3,1,1,4};
        
       //Test Case 2: False
    //    int[] testCase = new int[]{3,2,1,0,4};

      canJump(testCase);
    }
    
    public static boolean canJump(int[] nums) {
        int max = 0;
        for (int j = 0; j < nums.length; j++) {
            // j>max代表着 这个格子是跳不到的
            if(j>max){
                return false;
            }
            // 如果当年 Max 值大于原先 Max 值则更新
            max = j+nums[j]>max?j+nums[j]:max;
        }
        // 最后比较最大 Max 值和数组的长度。
        if(max>=(nums.length-1)){
            return true;
        }else{
            return false;
        }
    }

}