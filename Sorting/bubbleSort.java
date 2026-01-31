package Sorting;
import java.util.*;
public class bubbleSort {
    public static void bubbleSorting(int[] marks,int n){
        for(int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j = 0; j < n-i-1; j++) {
                if(marks[j]>marks[j+1]){
                    int temp=marks[j];
                    marks[j]=marks[j+1];
                    marks[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag) break;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        bubbleSorting(marks,n);
        for(int i=0;i<n;i++){
            System.out.print(marks[i]+" ");
        }
    }
}
