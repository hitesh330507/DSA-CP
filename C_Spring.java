import java.io.*;
import java.util.*;
public class C_Spring {

    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }
static long gcd(long a,long b){
    while(b!=0){
        long t=b;
        b=a%b;
        a=t;
    }
    return a;
}

static long lcm(long a,long b){
    return (a/gcd(a,b))*b;
}

static void solve(){
    int t = fs.nextInt();

    while(t-- > 0){

        long a = fs.nextLong();
        long b = fs.nextLong();
        long c = fs.nextLong();
        long m = fs.nextLong();

        long A = m/a;
        long B = m/b;
        long C = m/c;

        long ab = lcm(a,b);
        long ac = lcm(a,c);
        long bc = lcm(b,c);

        long AB = m/ab;
        long AC = m/ac;
        long BC = m/bc;

        long abc = lcm(a, lcm(b,c));
        long ABC = m/abc;

        long ABonly = AB - ABC;
        long AConly = AC - ABC;
        long BConly = BC - ABC;

        long Aonly = A - AB - AC + ABC;
        long Bonly = B - AB - BC + ABC;
        long Conly = C - AC - BC + ABC;

        long Alice = 6*Aonly + 3*(ABonly + AConly) + 2*ABC;
        long Bob   = 6*Bonly + 3*(ABonly + BConly) + 2*ABC;
        long Carol = 6*Conly + 3*(AConly + BConly) + 2*ABC;

        System.out.println(Alice+" "+Bob+" "+Carol);
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