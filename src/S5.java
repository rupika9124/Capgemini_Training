import java.util.*;
public class S5 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++){
            String ans="";
            for(int j=0;j<arr[i].length();j++){
                if(j%2==0){
                    ans+=Character.toUpperCase(arr[i].charAt(j));
                }
                else{
                    ans+=Character.toLowerCase(arr[i].charAt(j));
                }
            }
            System.out.print(ans+" ");
        }

    }
}
