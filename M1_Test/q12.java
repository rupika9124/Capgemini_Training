package M1_Test;

public class q12 {
    static void main(String[] args) {
        int arr[]={1,2,4,5,6,7,8};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int sumAll=0;
        for(int i=1;i<=n+1;i++){
            sumAll+=i;
        }
        System.out.println(sumAll-sum);

    }
}
