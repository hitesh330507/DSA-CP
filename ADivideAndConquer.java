import java.io.*;
import java.util.*;

public class ADivideAndConquer {

    static FastScanner fs = new FastScanner();

    public static void main(String[] args) throws Exception {
        int t = 1;
        t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }
    }

    static void solve() throws Exception {
        int x=fs.nextInt();
        int y=fs.nextInt();
        if(x%y==0) System.out.println("YES");
        else System.out.println("NO");

    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws Exception {
            return Integer.parseInt(next());
        }

        long nextLong() throws Exception {
            return Long.parseLong(next());
        }
    }
}