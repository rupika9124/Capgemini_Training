package M1_Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        if(a.length()!=b.length()){
            System.out.println("no");
            return;
        }
        char arr[]=a.toCharArray();
        char arr1[]=b.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=arr1[i]){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");
    }
}
