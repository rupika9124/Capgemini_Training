package M1_Test;

import java.util.Scanner;

public class q6 {
    static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split("\\s+");
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i])) count++;
        }
        System.out.println(count);
    }
}
