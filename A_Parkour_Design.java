import java.io.*;
import java.util.*;
public class A_Parkour_Design {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }
    static void solve() {
        int t = fs.nextInt();
        while (t-- > 0) {
            int x=fs.nextInt();
            int y=fs.nextInt();
            int ans=x+y;
            if(y>0){
            if(x>=(2*y)){
                if(ans%3==0 && ans>0) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        else if(y<0){
            if(x>=(4*Math.abs(y))){
                if(ans%3==0 && ans>0) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
        else if(y==0){
            if(x%3==0) System.out.println("YES");
            else System.out.println("NO");
        }
            else System.out.println("NO");
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
