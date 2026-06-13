import java.util.*;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr1 = new int[n];
            int[] arr2 = new int[n];

            for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();
            for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

            int ans = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    int max = Math.max(arr1[i], arr1[j]);
                    int min = Math.min(arr1[i], arr1[j]);

                    int rem = Math.min(max / 2, 100);
                    int total = min + (max - rem);

                    if (total <= k) {
                        ans = Math.max(ans, arr2[i] + arr2[j]);
                    }
                }
            }

            System.out.println(ans);
        }
    }
}