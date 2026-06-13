import java.io.*;
import java.util.*;
public class B_Flipping_Binary_String {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }
    static void solve() {
        int t = fs.nextInt();

        for (int j = 0; j < t; j++) {
            int n = fs.nextInt();
            String s = fs.next();

            List<Integer> ones = new ArrayList<>();
            List<Integer> zeros = new ArrayList<>();

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '1') ones.add(i + 1);
                else zeros.add(i + 1);
            }

            if (ones.size() % 2 == 1 && n%2==1) {
                System.out.println(-1);
            } else if (ones.size() == 0) {
                System.out.println(0);
            } else if (zeros.size() % 2 == 1) {
                System.out.println(zeros.size());
                for (int i = 0; i < zeros.size(); i++) {
                    System.out.print(zeros.get(i)+" ");
                }
                System.out.println();
            } else {
                System.out.println(ones.size());
                for (int i = 0; i < ones.size(); i++) {
                    System.out.print(ones.get(i)+" ");
                }
                System.out.println();
            }
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