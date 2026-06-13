import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Doremys_Paint_3 {
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            Map<Integer,Integer>map=new HashMap<>();
            for(int i:arr){
                map.put(i,map.getOrDefault(i,0 )+1);
            }
            if(n==2) System.out.println("Yes");
            else if(map.size()<2) System.out.println("Yes");
            else if(map.size()==2){
                int one=map.get(arr[0]);
                int second=map.get(arr[n-1]);
                int diff=one-second;
                if(Math.abs(diff)<=1) System.out.println("Yes");
                else System.out.println("No");
            }
            else System.out.println("No");
        }
        sc.close();
    }
}
