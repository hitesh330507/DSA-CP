/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            if(map.containsKey(target-nums[i])){
                ans[0]=map.get(target-nums[i]);;
                ans[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
// @lc code=end

