package M1_Test;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class q7 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        LinkedHashSet<Character> hm=new LinkedHashSet<>();
        for(int i=0;i<str.length();i++){
            hm.add(str.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char c:hm){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
