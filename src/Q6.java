import java.util.*;
public class Q6 {
    static boolean palindromeCheck(String str,HashMap<Character,Integer> hm){
        if(str.length()%2==0){
            for(int val : hm.values()){
                if(val % 2 != 0) {
                    return false;
                }
            }
        }
        else{
            int count=0;
            for(int val : hm.values()){
                if(val % 2 != 0) {
                    count++;
                }
                if(count>1) return false;
            }
        }
        return true;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashMap<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(palindromeCheck(str,hm));
    }
}
