class Solution {
    public static int longestBalanced(String s) {
        int ones = 0;
        int zeros = 0;
        int n = s.length();
        int ans = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '1') ones++;
            else zeros++;
        }

        if (ones == zeros) return n;
        if (s.charAt(0) == '0') {
            int i = 0;
            while (i < n - 1 && (s.charAt(i) == '0' && s.charAt(i + 1) == '1')) {
                ans++;
                i += 2; 
            }
        } else {
            int i = 0;
            while (i < n - 1 && (s.charAt(i) == '1' && s.charAt(i + 1) == '0')) {
                ans++;
                i += 2; 
            }
        }
        ans = 2 * ans;

        int maxzeros = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            while (i < n && s.charAt(i) == '0') {
                temp++;
                i++;
            }
            maxzeros = Math.max(temp, maxzeros);
        }
            if (maxzeros <= Math.min(ones, zeros)) {
                if (maxzeros == Math.min(ones, zeros)) ans = Math.max(ans, 2 * Math.min(ones, zeros));
                else ans = Math.max(ans, 2 * (maxzeros + 1));
            }

        int maxones = 0;
        for (int i = 0; i < n; i++) {
            int temp = 0;
            while (i < n && s.charAt(i) == '1') {
                temp++;
                i++;
            }
            maxones = Math.max(temp, maxones);
        }
            if (maxones <= Math.min(ones, zeros)) {
                if (maxones == Math.min(ones, zeros)) ans = Math.max(ans, 2 *Math.min(ones, zeros));
                else ans = Math.max(ans, 2 * (maxones + 1));
            }
        

        return ans;
    }
    public static void main(String[] args) {

        System.out.println(longestBalanced("100001")); // 4
        System.out.println(longestBalanced("111"));    // 0
        System.out.println(longestBalanced("10"));     // 2
        System.out.println(longestBalanced("0"));      // 0
        System.out.println(longestBalanced("01"));     // 2
        System.out.println(longestBalanced("1100"));   // 4
        System.out.println(longestBalanced("110100")); 
        System.out.println(longestBalanced("101"));   // 4
        System.out.println(longestBalanced("010"));  // 4
        System.out.println(longestBalanced("0101110"));  // 6
    }
}