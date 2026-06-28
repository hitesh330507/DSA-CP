/*
 * @lc app=leetcode id=3612 lang=java
 *
 * [3612] Process String with Special Operations I
 */

// @lc code=start
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(sb.length()>0 && ch=='*'){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(ch=='#'){
                sb.append(new StringBuilder(sb.toString()));
            }
            else if(ch=='%'){
                sb.reverse();
            }
            else if(Character.isLetter(ch))sb.append(ch);
        }
        return sb.toString();
    }
}
// @lc code=end

