// Question URL: https://leetcode-cn.com/problems/container-with-most-water/

// 输入: [1,8,6,2,5,4,8,3,7]
// 输出: 49

class max_water_container {
    public static void main(String[] args){
       //Test Case 1：49
       //int[] testCase = new int[]{1,8,6,2,5,4,8,3,7};

       //Test Case 2：4
       int[] testCase = new int[]{1,2,4,3};

       //Test Case 3：24
       //int[] testCase = new int[]{1,3,2,5,25,24,5};

       System.out.print(maxArea(testCase));
    }
    // 时间复杂度: ON2
    // public static int maxArea(int[] height) {
    //     int max_volume = 0;
    //     for (int i = 0; i < height.length; i++) {
    //         for (int j = i+1; j < height.length; j++) {
    //             if(height[i]>=height[j]){
    //                 max_volume = height[j]*(j-i)>max_volume?height[j]*(j-i):max_volume;
    //             }else{
    //                 max_volume = height[i]*(j-i)>max_volume?height[i]*(j-i):max_volume;
    //             }
    //         }
    //     }
    //     return max_volume;
    // }
    
    // 双指针法
    public static int maxArea(int[] height) {
        
        int i = 0, j = height.length-1;
        int max_volume = 0;

        while(true){
            if(i==j){
                break;
            }
            max_volume = Math.max((j-i)*Math.min(height[i], height[j]),max_volume);

            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max_volume;
    }

}