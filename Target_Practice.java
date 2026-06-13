import java.util.Scanner;

public class Target_Practice {
    static void solve(){
    final int[][] score = {
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String[] arr=new String[10];
            sc.nextLine();
            for(int i=0;i<10;i++){
                arr[i]=sc.nextLine();
            }
            int sum=0;
            for(int i=0;i<10;i++){
               for(int j=0;j<arr[0].length();j++){
                if(arr[0].charAt(j)=='X'){
                    sum+=score[i][j];
                }
               }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
