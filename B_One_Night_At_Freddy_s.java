import java.io.*;
import java.util.*;
public class B_One_Night_At_Freddy_s {
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
        int m = fs.nextInt();
        int l = fs.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fs.nextInt();
        }

        int[] lvls = new int[m];
        int curr = n;

        for (int i = 0; i < l; i++) {

            int idx = Math.min(m, curr + 1) - 1;
            lvls[idx]++;

            Arrays.sort(lvls);
            reverse(lvls);

            if (curr > 0 && a[n - curr] - 1 == i) {
                lvls[0] = 0;

                Arrays.sort(lvls);
                reverse(lvls);

                curr--;
            }
        }

        System.out.println(lvls[0]);
    }
}

static void reverse(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
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