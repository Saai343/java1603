import java.util.*;
public class EvenCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Count(s));
    }

    public static String Count(String s){
        int l=0;
        int r=0;
        StringBuilder sb = new StringBuilder();
        while(r<s.length()){
            l=r;
            int count=0;
            if (s.charAt(r)!=' '){
                while(r<s.length() && s.charAt(r)!=' '){
                    count++;
                    r++;
                }
                if(count%2==0){
                    for(int i=l;i<r;i++) {
                        sb.append(s.charAt(i));
                    }
                    sb.append(" ");
                }
            }
            if(r<s.length()) r++;
        }
        return(sb.toString());
    }
}