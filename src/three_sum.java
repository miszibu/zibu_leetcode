import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class three_sum {

    public void main(String[] args){
        int[] testCase = {-1, 0, 1, 2, -1, -4};
        threeSum(testCase);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Boolean> map = new HashMap<>();
            for (int j = i+1; j < nums.length; j++) {
                int targetNum = 0 - nums[i] - nums[j];
                if(map.containsKey(targetNum)){
                    if(!map.get(targetNum)){
                        res.add(new ArrayList<Integer>(Arrays.asList(nums[i],targetNum,nums[j])));
                        map.put(targetNum,  true);
                        map.put(nums[j],  true);
                    }
                }else{
                    map.put(nums[j], false);
                }
            }
        }

        return res;
        
    }
}