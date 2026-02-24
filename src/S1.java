import java.util.*;
public class S1 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String arr[]=str.split(" ");

        for(int i=1;i<arr.length;i+=2){

            String s=arr[i];
            StringBuilder sb=new StringBuilder(s);
            arr[i]=sb.reverse().toString();

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
