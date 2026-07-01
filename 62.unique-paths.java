/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    static int help(int row,int col,int m , int n, int[][] dp){
        if(row==0 && col==0) return 1;
        if(dp[row][col]!=-1) return dp[row][col];
        int downcount = 0;
        int rightcount = 0;
        if(row>0)
        downcount=help(row-1,col,m,n,dp);
        if(col>0)
        rightcount=help(row,col-1,m,n,dp);
        
        return dp[row][col]=downcount+rightcount;
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return help(m-1,n-1,m,n,dp);
    }
}
// @lc code=end

