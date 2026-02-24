import java.util.*;
public class S2 {
    static boolean mirror(String str,int n){
        int i=0;
        int j=n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        if(n%2!=0) {
            System.out.println(str);
            return;
        }
        boolean flag=mirror(str,n);
        if(flag) System.out.println(str.substring(0,n/2));
        else System.out.println(str);

    }
}
