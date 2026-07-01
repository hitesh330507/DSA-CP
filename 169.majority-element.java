/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int cand = nums[0];
        int count = 1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (count == 0) {
                cand = nums[i];
            }
            if (nums[i] == cand)
                count++;
            else
                count--;
        }
        return cand;
    }
}
// @lc code=end
