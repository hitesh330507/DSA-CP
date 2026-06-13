import java.io.*;
import java.util.*;
public class B_Olya_and_Game_with_Arrays {
    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

   static void solve() {
    int t = fs.nextInt();
    while (t-- > 0) {

        int n = fs.nextInt();

        int minn = (int)1e9 + 7;
        ArrayList<Integer> min2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int m = fs.nextInt();
            int[] v = new int[m];

            for (int j = 0; j < m; j++) {
                v[j] = fs.nextInt();
            }

            Arrays.sort(v);

            int minel = v[0];
            minn = Math.min(minn, minel);

            min2.add(v[1]); // second minimum
        }

        long sum = 0;
        int minOfMin2 = Integer.MAX_VALUE;

        for (int x : min2) {
            sum += x;
            minOfMin2 = Math.min(minOfMin2, x);
        }

        long ans = minn + sum - minOfMin2;
        out.println(ans);
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