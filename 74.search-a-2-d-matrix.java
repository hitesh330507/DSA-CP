/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            if(target>matrix[i][m-1]) continue;
            else {
                int low=0;
                int high=m-1;
                while(low<=high){
                    int mid=low+(high-low)/2;
                    if(matrix[i][mid]==target) return true;
                    else if(target>matrix[i][mid]) low=mid+1;
                    else high=mid-1;
                }
            }
        }
        return false;
    }
}
// @lc code=end

