package M1_Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class q8 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> al=new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<n;i++){
            if(arr[i-1]!=arr[i]){
                al.add(arr[i]);
            }
        }
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}
