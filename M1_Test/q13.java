package M1_Test;

import java.util.Scanner;

public class q13 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int countUpper=0;
        int countLower=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)) countUpper++;
            else countLower++;
        }
        if(countUpper>countLower) {
            System.out.println(str.toUpperCase());
        }
        else{
            System.out.println(str.toLowerCase());
        }
    }
}
