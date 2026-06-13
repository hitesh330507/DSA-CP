import java.io.*;
import java.util.*;
public class B_Beautiful_Numbers {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    static void solve() {
    int t = fs.nextInt();
    while (t-- > 0) {

        long x = fs.nextLong();
        long sum = 0;

        List<Integer> digits = new ArrayList<>();

        // extract digits
        while (x > 0) {
            int d = (int)(x % 10);
            digits.add(d);
            sum += d;
            x /= 10;
        }

        if (sum < 10) {
            System.out.println(0);
            continue;
        }

        int ans = 0;

        // last digit in original number
        int k = digits.get(digits.size() - 1);

        // sort in descending order
        digits.sort(Collections.reverseOrder());

        for (int i = 0; i < digits.size(); i++) {

            if (digits.get(i) == 0)
                continue;

            if (i < digits.size() - 1 &&
                digits.get(i) == k &&
                digits.get(i + 1) != k) {

                sum -= (digits.get(i) - 1);
                k = 10;

            } else {
                sum -= digits.get(i);
            }

            ans++;

            if (sum < 10)
                break;
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