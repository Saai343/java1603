package Day19;

import java.util.HashMap;
import java.util.Scanner;

public class Test_Substring1 {
    public static int Substring1(String s,int k){
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0;
        int l =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()>k){
                char left = s.charAt(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                l++;
            }
            max=Math.max(i-l+1,max);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        System.out.println(Substring1(s,k));
    }

}
