import java.util.Scanner;

public class Social_Experiment {
    static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==2) System.out.println(0);
            if(n==3) System.out.println(0);
            if(n>=4) System.out.println(n%2);
        }
    }
}   
