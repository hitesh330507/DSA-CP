import java.io.*;
import java.util.*;
public class B_Cyclists {
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
            int k = fs.nextInt();
            int win = fs.nextInt();
            int m = fs.nextInt();
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=fs.nextInt();
                list.add(x);
            }
            int wp=win-1;
            int ans=0;
            while(true){

                if(wp<k){
                    int got=list.get(wp);
                    if(m>=got){
                        m-=got;
                        ans++;
                        list.remove(Integer.valueOf(got));
                        list.add(got);
                        wp=n-1;

                    }
                    else break;
                }
                else {
                    int min=Integer.MAX_VALUE;
                    // int minind=0;
                    for(int i=0;i<k;i++){
                        if(min>list.get(i)){
                            min=list.get(i);
                            // minind=i;
                        }
                    }
                    if(m>=min){
                        m-=min;
                        list.remove(Integer.valueOf(min));
                        list.add(min);
                        wp--;
                    }
                    else break;
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