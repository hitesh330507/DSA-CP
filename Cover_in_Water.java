import java.util.Scanner;

public class Cover_in_Water {
    public static void solve(){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s=sc.nextLine();
            sc.nextLine();
            int empty=0;
            int conti=0;
            boolean flag=false;
            for(int i=0;i<n;i++){
                if(s.charAt(i)=='.'){
                    empty++;
                    conti++;
                }
                else{
                    conti=0;
                }
                if(conti>=3){
                        flag=true;
                        System.out.println(2); 
                        break;
                    }
            }
            if(!flag) System.out.println(empty);
        }
        sc.close();
    }
}
