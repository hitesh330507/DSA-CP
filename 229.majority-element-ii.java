/*
 * @lc app=leetcode id=229 lang=java
 *
 * [229] Majority Element II
 */

// @lc code=start

import java.util.ArrayList;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cand1=0;
        int cand2=0;
        int n=nums.length;
        int count1=0;
        int count2=0;
        for(int i:nums){
            if(i==cand1) count1++;
            else if(i==cand2) count2++;
           else if(count1==0) {
                cand1=i;
                count1=1;
            }
            else if(count2==0){
                cand2=i;
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        int temp1=0;
        int temp2=0;
        for(int i:nums){
            if(i==cand1) temp1++;
            else if(i==cand2) temp2++;
        }
        List<Integer> ans=new ArrayList<>();
        if(temp1>n/3) ans.add(cand1);
        if(temp2>n/3) ans.add(cand2);
        return ans;
    }
}
// @lc code=end

