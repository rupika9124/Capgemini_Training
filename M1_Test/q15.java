package M1_Test;

import java.util.Scanner;

public class q15 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.length()<=10) {
            System.out.println(str);
            return;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(str.charAt(0));
        int count=0;
        for(int i=1;i<str.length()-1;i++){
            count++;
        }
        sb.append(count);
        sb.append(str.charAt(str.length()-1));
        System.out.println(sb.toString());
    }
}
