import java.io.*;
import java.util.*;
public class C_Raspberries {

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
            int k=fs.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=fs.nextInt();
            }
            if(k==2) {
                int x=two(arr);
                System.out.println(x);
            }
            else if(k==3){
                int x=three(arr);
                System.out.println(x);
            }
            else if(k==4){
                int x=four(arr);
                System.out.println(x);
            }
            else if(k==5){
                int x=five(arr);
                System.out.println(x);
            }
        }
    }
    static int two(int[] arr){
        boolean even=false; 
        for(int i:arr){
            if(i%2==0) {
                even=true;
                break;
            }
        }
        if(even) return 0;
        else return 1;
    }
    static int three(int[] arr){
        boolean found=false;
        for(int i:arr){
            if(i%3==0) {
                found=true;
                break;
            }
        }
        if(found) return 0;
        int ans=Integer.MAX_VALUE;
            for(int i:arr){
                ans=Math.min(ans,(3-(i%3)));
            }
            return ans;
    }
    static int four(int[] arr){
        int ans=Integer.MAX_VALUE;
        int cnt=0;
        for(int i:arr){
            if(i%2==0) cnt++;
        }
        if(cnt>=2) return 0;
        if(cnt==1) ans = 1;
        for(int i:arr){
            if(i%4==0) return 0;
            ans=Math.min(ans,(4-(i%4)));
        }
        if(ans>2) return 2;
        else 
        return ans;
    }
    static int five(int[] arr){
        boolean found=false;
        for(int i:arr){
            if(i%5==0) {
                found=true;
                break;
            }
        }
        if(found) return 0;
        int ans=Integer.MAX_VALUE;
            for(int i:arr){
                ans=Math.min(ans,(5-(i%5)));
            }
            return ans;
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