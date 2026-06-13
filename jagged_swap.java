import java.util.Scanner;

public class jagged_swap {
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int min=arr[0];
            for(int i:arr){
                min=Math.min(i, min);
            }
            if(min==arr[0]) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
