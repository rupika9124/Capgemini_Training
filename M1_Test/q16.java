package M1_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class q16 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0) al.add(arr[i]);
        }
        int id=0;
        if(al.size()%2==0){
            id=(al.size()/2)-1;
        }
        else{
            id=al.size()/2;
        }
        System.out.println(al.get(id));
    }
}
