package Day17;
import java.util.*;

public class freq_sort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count=0;
        String s = sc.nextLine();
        int k = sc.nextInt();
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder();
            HashSet<Character> set = new HashSet<>();
            for(int j=i;j<s.length();j++){
                set.add(s.charAt(j));
                sb.append(s.charAt(j));
                if(set.size()==k) count++;
                else if(set.size()>k) break;
            }
        }
        System.out.println(count);
    }
}
