
import java.util.Scanner;

public class Halloumi_Boxes {
    public static void solve() {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (k == 1) {
            boolean sorted = true;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    sorted = false;
                    break;
                }
            }
            System.out.println(sorted ? "YES" : "NO");
        } else {
            System.out.println("YES");
        }
    }
    sc.close();
}

}