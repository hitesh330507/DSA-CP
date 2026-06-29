/*
 * @lc app=leetcode id=2965 lang=java
 *
 * [2965] Find Missing and Repeated Values
 */

// @lc code=start
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] nums) {
        int n=nums.length;
        int m=nums[0].length;
        int[] ans=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int row=(Math.abs(nums[i][j])-1)/n;
                int col=(Math.abs(nums[i][j])-1)%n;
                if(nums[row][col]<0) ans[0]=Math.abs(nums[i][j]);
                else
                nums[row][col]=-nums[row][col];
            }
        }
        for(int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]>0){
                    ans[1]=i*n+j+1;
                }
            }
        }
        return ans;
    }
}
// @lc code=end

