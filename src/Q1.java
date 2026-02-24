import java.util.*;
class Q1{
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0;
        int j=i+1;
        while(i<arr.length-1){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i+=2;
                j+=2;
            }
        }
        for (int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}