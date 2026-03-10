package M1_Test;

import java.util.HashMap;
import java.util.Scanner;

public class q3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        HashMap<Integer,Character> hm=new HashMap<>();
        char c='A';
        for(int i=1;i<=26;i++){
            hm.put(i,c++);
        }
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='0'){
                sb.append(hm.get(count));
                count=0;
            }
            else{
                count++;
            }
        }
        if(str.charAt(str.length()-1)!='0') sb.append(hm.get(count));
        System.out.println(sb.toString());
    }
}
