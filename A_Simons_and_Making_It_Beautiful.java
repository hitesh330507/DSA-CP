import java.io.*;
import java.util.*;
public class A_Simons_and_Making_It_Beautiful {

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
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fs.nextInt();
            }
            int max=Integer.MIN_VALUE;
            int maxind=0;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    maxind=i;
                }
            }
            int  tempmax=arr[0];
            boolean used=false;
            int tempind=0;
            for(int i=0;i<n;i++){
                tempind++;
                tempmax=Math.max(tempmax,arr[i]);
                if(tempmax>tempind) continue;
                else {
                    if(!used && i!=n-1){
                        int temp=arr[i];
                        arr[i]=max;
                        arr[maxind]=temp;
                        used=true;
                    }
                }
                if(used) break;
            }
            for(int i:arr) System.out.print(i+" ");
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