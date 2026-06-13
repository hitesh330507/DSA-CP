import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

class test1 {
    public static int longestArithmetic(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=nums[i+1]-nums[i];
        }
        int maxlen=2;
        int m=arr.length;
        int l=0;
        int r=0;
        boolean used=false;
        int num=Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
                // System.out.println("max="+num);
        while(r<m){
            while(r<m && (arr[r]==num || !used)){
                    if(arr[r]!=num){
                if(r+1<m && (nums[r+2]-nums[r])==2*num){
                    used=true;
                    arr[r]=num;
                    arr[r+1]=num;
                }
                    else {
                        used=true;
                        r++;
                        break;
                    }
                    }
                r++;
            }
            
            maxlen=Math.max(r-l+1,maxlen);
            l=r;
            used=false;
        }
        return Math.min(maxlen,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=longestArithmetic(arr);
            System.out.println(ans);
        }
        sc.close();
    }
}