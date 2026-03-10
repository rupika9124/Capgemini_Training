package M1_Test;

import java.util.Arrays;

public class q10 {
    static void main(String[] args) {
        int arr[]={5,0,7,6};
        int n=arr.length;
        int arr1[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr1[j]){
                arr1[j]=arr[i];
                j++;
            }
        } for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
