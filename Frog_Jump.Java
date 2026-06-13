// import java.util.Arrays;

// class Solution {
//     static int helper(int ind,int[] dp,int[] heights){
//         if(ind==0) return 0;
//         if(dp[ind]!=-1) return dp[ind];
//         int left=helper(ind-1,dp,heights)+(Math.abs(heights[ind]-heights[ind-1]));
//         int right=helper(ind-2,dp,heights)+(Math.abs(heights[ind]-heights[ind-2]));

//         dp[ind]=Math.min(left,right);
//     }
//     int minCost(int[] height) {
//         int[] dp=new int[height.length];
//         Arrays.fill(dp, -1);
//         return helper(height.length-1,dp,height);
//     }

// public class Solution {

//     int minCost(int[] nums){
//         int[] dp=new int[nums.length];
//         dp[0]=0;
//         dp[1]=Math.abs(nums[1]-nums[0]);
//         for(int i=2;i<nums.length;i++){
//             int one=dp[i-1]+Math.abs(nums[i]-nums[i-1]);
//             int two=dp[i-2]+Math.abs(nums[i]-nums[i-2]);
//             dp[i]=Math.min(one,two);
//         }
//         return dp[dp.length-1];
//     }
// }

// public class Solution {

//     int minCost(int[] nums){
//         int prev=Math.abs(nums[1]-nums[0]);
//         int prev1=0;
//         for(int i=2;i<nums.length;i++){
//             int one=prev+(Math.abs(nums[i]-nums[i-1]));
//             int two=prev1+(Math.abs(nums[i]-nums[i-2]));
//             prev1=prev;
//             prev=Math.min(one,two);
//         }
//         return prev;
//     }
// }