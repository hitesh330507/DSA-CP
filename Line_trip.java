import java.util.ArrayList;
import java.util.Scanner;

public class Line_trip {
    static void solve(){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {

            long n = sc.nextLong(); // number of gas stations
            long x = sc.nextLong(); // destination point

            ArrayList<Long> points = new ArrayList<>();
            points.add(0L); // starting point

            for (int i = 0; i < n; i++) {
                points.add(sc.nextLong()); // gas stations
            }

            points.add(x); // destination

            long maxDist = Long.MIN_VALUE;

            for (int i = 1; i < points.size(); i++) {
                long gap = points.get(i) - points.get(i - 1);

                // last segment → round trip
                if (i == points.size() - 1) {
                    maxDist = Math.max(maxDist, 2 * gap);
                } else {
                    maxDist = Math.max(maxDist, gap);
                }
            }

            System.out.println(maxDist);
        }

        sc.close();
    }
 }

