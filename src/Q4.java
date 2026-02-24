import java.util.*;
public class Q4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
            int diff=0;
            for(int j=i+1;j<n;j++){
                diff=arr[j]-arr[i];
                max=Math.max(diff,max);
            }
        }
        System.out.println(max);
    }
}
