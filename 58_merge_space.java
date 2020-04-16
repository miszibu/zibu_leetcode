import java.util.*;
class test {
    public static void main(String[] args){
       //Test Case 1
    //    int[][] testCase1 = new int[4][2];
    //    testCase1[0] = new int[]{1,3};
    //    testCase1[1] = new int[]{2,6};
    //    testCase1[2] = new int[]{8,10};
    //    testCase1[3] = new int[]{15,18};

       //Test Case2
    int[][] testCase1 = new int[2][2];
        testCase1[0] = new int[]{1,4};
        testCase1[1] = new int[]{2,3};

       System.out.println(merge(testCase1).toString());
    }
    public static int[][] merge(int[][] arr) {
            if(arr == null || arr.length<=1){
                return arr;
            }
            List<int[]> output = new ArrayList<>();            
            Arrays.sort(arr,(a,b)->a[0]-b[0]);
            int i = 1;
            int front = arr[0][0];
            int end = arr[0][1];
            while(i < arr.length){
                if(arr[i][0]<=end && arr[i][1]<=end){
                    i++;
                    continue;
                }else if(arr[i][0]<=end){
                    end = arr[i][1];
                    i++;
                    continue;
                }else{
                    output.add(new int[]{front, end});
                    front = arr[i][0];
                    end=arr[i][1];
                    i++;
                }
            }
            output.add(new int[]{front, end});
            //output.forEach(e->System.out.println(e[0]+" "+e[1]));
            return output.toArray(new int[output.size()][2]);
    }
}

// 输入: [[1,3],[2,6],[8,10],[15,18]]
// 输出: [[1,6],[8,10],[15,18]]
// 解释: 区间 [1,3] 和 [2,6] 重叠, 将它们合并为 [1,6].
