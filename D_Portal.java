import java.io.*;
import java.util.*;
public class D_Portal {

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
        int x = fs.nextInt() - 1;
        int y = fs.nextInt() - 1;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = fs.nextInt();

        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i <= x || i > y) a.add(arr[i]);
            else b.add(arr[i]);
        }

        // rotate b so min element becomes first
        if (!b.isEmpty()) {
            int minIndex = 0;
            for (int i = 1; i < b.size(); i++) {
                if (b.get(i) < b.get(minIndex))
                    minIndex = i;
            }

            Collections.rotate(b, -minIndex);
        }

        int m = b.isEmpty() ? -1 : b.get(0);

        int pos = 0;
        while (pos < a.size() && a.get(pos) < m) pos++;

        a.addAll(pos, b);

        for (int v : a) System.out.print(v + " ");
        System.out.println();
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