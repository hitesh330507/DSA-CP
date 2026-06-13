import java.io.*;
import java.util.*;
public class A_Flip_Flops {
    static FastScanner fs = new FastScanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    static void solve() {
        int t = fs.nextInt();
        while (t-- > 0) {
            int n=fs.nextInt();
            long c=fs.nextInt();
            int k=fs.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fs.nextInt();
            }
            Arrays.sort(arr);
            boolean usedflip=false;
            if(n==1){
                if(arr[0]+k<=c){
                    c+=arr[0];
                    c+=k;
                }
                else if(arr[0]<=c){
                    int x=arr[0]+k;
                    int temp=(int) (x-c);
                    c+=(k-temp);
                    c+=arr[0];
                }
                System.out.println(c);
                continue;
            }
            if(c>=arr[0]){
                c+=arr[0];
                // c+=(k-((arr[0]+k)-c));
            }
            for(int i=1;i<n;i++){
                if(arr[i]+k<=c && !usedflip){
                    c+=arr[i];
                    c+=k;
                    usedflip=true;
                }
                else if(arr[i]<=c){
                    c+=arr[i];
                }
            }
            System.out.println(c);
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