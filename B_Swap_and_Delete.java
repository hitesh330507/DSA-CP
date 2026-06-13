import java.io.*;
import java.util.*;
public class B_Swap_and_Delete {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    static void solve() {
        int t = fs.nextInt();
while (t-- > 0) {
    String s = fs.next();
    int ones = 0, zeros = 0;
    int n = s.length();

    for(char ch : s.toCharArray()){
        if(ch == '1') ones++;
        else zeros++;
    }

    int ans = 0;

    for(int i = 0; i <= n; i++){
        if(i == n){
            ans = 0;
            break;
        }

        if(s.charAt(i) == '1'){
            if(zeros == 0){
                ans = n - i;
                break;
            }
            zeros--;
        } 
        else{
            if(ones == 0){
                ans = n - i;
                break;
            }
            ones--;
        }
    }

    System.out.println(ans);
}
    }

    // ---------- FAST IO ----------
    static class FastScanner {
        private final InputStream in;
        private final byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream in) {
            this.in = in;
        }

        int read() {
            if (ptr >= len) {
                try {
                    len = in.read(buffer);
                    ptr = 0;
                    if (len <= 0) return -1;
                } catch (IOException e) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        int nextInt() {
            int c, sign = 1, val = 0;
            do c = read(); while (c <= ' ');
            if (c == '-') { sign = -1; c = read(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        long nextLong() {
            int c, sign = 1;
            long val = 0;
            do c = read(); while (c <= ' ');
            if (c == '-') { sign = -1; c = read(); }
            while (c > ' ') {
                val = val * 10 + (c - '0');
                c = read();
            }
            return val * sign;
        }

        String next() {
            int c;
            StringBuilder sb = new StringBuilder();
            do c = read(); while (c <= ' ');
            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }
            return sb.toString();
        }
    }
}