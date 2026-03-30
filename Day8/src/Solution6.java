import java.util.*;

public class Solution6 {

    public static String Shortestword(String s){
        int count = 0;
        int mincount=Integer.MAX_VALUE;
        int lind=0;
        int l=0,r=0;

        while(r<s.length()){
            if(s.charAt(r)!=' '){
                count=0;
                l=r;
                while(r<s.length() && s.charAt(r)!=' '){
                    r++;
                    count++;
                }
                if(count<mincount){
                    mincount=count;
                    lind=l;
                }
            }
            if(r<s.length()) r++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=lind;i<lind+mincount;i++){
            sb.append(s.charAt(i));
        }
        return(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Shortestword(s));

    }
}
