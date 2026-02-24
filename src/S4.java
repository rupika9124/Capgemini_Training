import java.util.*;
public class S4 {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            sb.append(e.getKey());
            sb.append(e.getValue());
        }
        System.out.println(sb.toString());
    }
}
