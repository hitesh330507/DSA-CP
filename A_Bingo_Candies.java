import java.io.*;
import java.util.*;
public class A_Bingo_Candies {

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
            int[][] arr=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=fs.nextInt();
                }
            }
            Map<Integer,Integer> map=new HashMap<>();
           for(int i=0;i<n;i++){
            for(int j:arr[i]){
                map.put(j,map.getOrDefault(j, 0)+1);
            }
           }
           if(map.size()<2) {
            System.out.println("NO");
            continue;
           }
        //    System.out.println("map="+map);
           int max=Integer.MIN_VALUE; 
           for(int i:map.keySet()){
            max=Math.max(map.get(i), max);
           }
           if(max>((n*n)-n)){
            System.out.println("NO");
            continue;
           }
           System.out.println("YES");

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