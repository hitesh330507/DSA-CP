// // import java.util.Arrays;
// // import java.util.Scanner;

// // public class lc {
// //     public static void main(String[] args) {
// //         Scanner sc=new Scanner(System.in);
// //         int t=sc.nextInt();
// //         while(t-->0){
// //         int n=sc.nextInt();
// //         int[] arr=new int[n];
// //         for(int i=0;i<n;i++) arr[i]=sc.nextInt();
// //         System.out.println(gcdpair(arr));
// //     }
// //         sc.close();
// //     }
// //     static long gcdpair(int[] arr){
// //         if(arr.length<=1) return 0;
// //         int n=arr.length;
// //         int max=arr[0];
// //         long sum=0;
// //         int[] temp=new int[n];
// //         for(int i=0;i<n;i++){
// //             if(max<arr[i]) max=arr[i];
// //             temp[i]=gcd(arr[i],max);
// //         }
// //         Arrays.sort(temp);
// //         int l=0,i=n-1;
// //         while(l<r){
// //             sum+=gcd(temp[l],temp[r]);
// //             l++;    
// //             r--;
// //         }
// //         return sum;
// //     }
// //     static int gcd(int a,int b){
// //         while(b!=0){
// //             int temp=b;
// //             b=a%b;
// //             a=temp;
// //         }
// //         return a;
// //     }
// // }

// import java.util.*;

// public class lc {

//     public static void main(String[] args) {

//         int[][] testCases = {
//             {5},
//             {8,2},
//             {6,9,3,15},
//             {4,8,12},
//             {7,7,7,7,7},
//             {2,4,6,8,10},
//             {10,8,6,4,2},
//             {2,3,5,7,11},
//             {100,25,50,10,5,20},
//             {3,6,9,12,15,18},
//             {1,1,1,1},
//             {9,6,3},
//             {12,15,18,21},
//             {5,10,15,20,25},
//             {17,34,51,68},
//             {6,10,15},
//             {8,16,24,32,40,48},
//             {11,22,33,44,55},
//             {14,21,28,35,42},
//             {18,24,30,36,42,48}
//         };

//         for (int i = 0; i < testCases.length; i++) {
//             long result = gcdpair(testCases[i]);
//             System.out.println("Test " + (i+1) + " -> " + result);
//         }
//     }

//     static long gcdpair(int[] arr){
//         if(arr.length<=1) return 0;
//         int n=arr.length;
//         int max=arr[0];
//         long sum=0;
//         int[] temp=new int[n];
//         for(int i=0;i<n;i++){
//             if(max<arr[i]) max=arr[i];
//             temp[i]=gcd(arr[i],max);
//         }
//         Arrays.sort(temp);
//         int l=0,r=n-1;
//         while(l<r){
//             sum+=gcd(temp[l],temp[r]);
//             l++;    
//             r--;
//         }
//         return sum;
//     }

//     static int gcd(int a,int b){
//         while(b!=0){
//             int temp=b;
//             b=a%b;
//             a=temp;
//         }
//         return a;
//     }
// }


// class Solution {
//     private String s;
//     private Boolean[][][] dp;
    
//     public int almostPalindromic(String s) {
//         this.s=s;
//         int n=s.length();
//         this.dp=new Boolean[n][n][2];
        
//         int ans=0;
        
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(ispali(i,j,1)){
//                     ans=Math.max(ans,j-i+1);
//                 }
//             }
//         }
        
//         return ans;
//     }
    
//     private boolean ispali(int i, int j, int k){
//         if(i>j) return k==0;
//         if(i==j) return k==0;
        
//         if(dp[i][j][k]!=null) return dp[i][j][k];
        
//         boolean result=false;
        
//         if(s.charAt(i)==s.charAt(j)){
//             if(i+1==j){
//                 result=(k==0 ||  k==1);
//             } else {
//                 result=ispali(i+1,j-1,k) || (k==1 && ispali(i+1,j-1,0));
//             }
//         } else {
//             if(i+1==j){
//                 result=(k==1);
//             } else {
//                 if(k==1){
//                     result=ispali(i+1,j, 0) || ispali(i,j-1,0);
//                 }
//             }
//         }
        
//         dp[i][j][k]=result;
//         return result;
//     }
// }

// class Solution {
//     public int almostPalindromic(String s) {
//         int n=s.length();
//         boolean[][] dp0=new boolean[n][n]; 
//         boolean[][] dp1=new boolean[n][n];  
        
//         for(int i=0;i<n;i++){
//             dp0[i][i]=true;
//         }
        
//         int ans=0;
        
//         for(int len=2;len<=n;len++){
//             for(int i=0;i<=n-len;i++){
//                 int j=i+len-1;
                
//                 if(s.charAt(i)==s.charAt(j)){
//                     if(len==2){
//                         dp0[i][j]=true;
//                         dp1[i][j]=true;
//                     } else {
//                         dp0[i][j]=dp0[i+1][j-1];
//                         dp1[i][j]=dp0[i+1][j-1] || dp1[i+1][j-1];
//                     }
//                 } else {
//                     if(len==2){
//                         dp1[i][j]=true;
//                     } else {
//                         dp1[i][j]=dp0[i+1][j] || dp0[i][j-1];
//                     }
//                 }
                
//                 if(dp1[i][j]){
//                     ans=Math.max(ans,len);
//                 }
//             }
//         }
        
//         return ans;
//     }
// }
import java.util.*;

class Codechef {
    static class pair {
        int x, y;
        pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<pair> list = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                list.add(new pair(sc.nextInt(), i));
                list.add(new pair(sc.nextInt(), i));
                list.add(new pair(sc.nextInt(), i));
            }

            Collections.sort(list, (a, b) -> a.x - b.x);

            int[] arr = new int[n];
            int cnt = 0;

            int l = 0;
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < list.size(); i++) {
                pair p = list.get(i);

                if (arr[p.y] == 0) cnt++;
                arr[p.y]++;

                while (cnt == n) {
                    ans = Math.min(ans, list.get(i).x - list.get(l).x);

                    pair q = list.get(l);
                    arr[q.y]--;
                    if (arr[q.y] == 0) cnt--;

                    l++;
                }
            }

            System.out.println(ans);
        }
    }
}