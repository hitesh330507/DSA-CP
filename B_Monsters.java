import java.io.*;
import java.util.*;
public class B_Monsters {

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
        long k = fs.nextInt();

        PriorityQueue<pair> pq = new PriorityQueue<>((a, b) -> {
            if (b.num != a.num) return Long.compare(b.num, a.num);
            return a.ind - b.ind;
        });

        for (int i = 0; i < n; i++) {
            int x = fs.nextInt();
            long curr = x % k;
            if (curr == 0) curr = k;
            pq.add(new pair(i, curr));
        }

        while (!pq.isEmpty()) {
            System.out.print((pq.poll().ind + 1) + " ");
        }
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
class pair{
    int ind;
    long num;
    public pair(int ind,long num){
        this.ind=ind;
        this.num=num;
    }
}