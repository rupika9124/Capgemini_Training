package M1_Test;

import java.util.Scanner;

public class q1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        String S=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=N;i++){
            sb.append(S);
        }
        System.out.println(sb.toString());
    }
}
