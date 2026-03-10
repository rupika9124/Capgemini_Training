package M1_Test;

import java.util.HashMap;
import java.util.Scanner;

public class q4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        int max=0;
        char ch='0';
        int repeat=0;
        for(HashMap.Entry<Character,Integer>e: hm.entrySet()){
            int count=e.getValue();
            if(count>max){
                max=count;
                ch=e.getKey();
                repeat=1;
            }
            else if(count==max){
                repeat++;
            }
        }
        if(repeat>1){
            System.out.println(0);
        }
        else {
            System.out.println(ch);
        }

    }
}
