/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            if((nums[Math.abs(nums[i])-1])<0) return Math.abs(nums[i]);
            nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
        }
        return 0;
    }
}
// @lc code=end

