import java.util.*;
public class S3 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            sb.append(s.charAt(i));
            sb.append(t.charAt(j));
            i++;
            j++;
        }
        while(i<s.length()){
            sb.append(s.charAt(i));
            i++;
        }
        while(j<t.length()){
            sb.append(t.charAt(j));
            j++;
        }
        System.out.println(sb.toString());
    }
}
