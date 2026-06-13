import java.util.Scanner;

public class How_Much_Does_Daytona_Cost {
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            boolean flag=false;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==k){
                    flag=true;
                    break;
                }
            }
            if(flag) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}
