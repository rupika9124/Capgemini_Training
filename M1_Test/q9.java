package M1_Test;

import java.util.Scanner;

public class q9 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a') sb.append('x');
            else if(ch=='b') sb.append('y');
            else if(ch=='c') sb.append('z');
            else if(ch==' ') sb.append(ch);
            else{
                ch=(char) (ch-3);
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
