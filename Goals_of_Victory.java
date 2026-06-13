import java.util.Scanner;

public class Goals_of_Victory {
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n-1];
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int sum=0;
            for(int i:arr){
                sum+=i;
            }
            System.out.println(sum*-1);
        }
        sc.close();
    }
}
