/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    static void swap(int[] nums,int i,int j){
        if(i==j) return;
        nums[i]=nums[i]^nums[j];
        nums[j]=nums[i]^nums[j];
        nums[i]=nums[i]^nums[j];
    }
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1) mid++;
            else {
                swap(nums,mid,high);
                high--;
            }
        }
    }
}
// @lc code=end

