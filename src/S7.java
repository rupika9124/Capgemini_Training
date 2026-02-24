import java.util.*;
public class S7 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str[]=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr.contains(str[i])){
                System.out.println(str[i]);
                return;
            }
            arr.add(str[i]);
        }
        System.out.println(" ");
    }
}
