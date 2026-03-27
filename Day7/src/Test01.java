import java.util.*;

public class Test01 {

    public static int Wordcount(String s){
        int count=0;
        if(s.length()==0) return 0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==' ' && s.charAt(i)!=' ') count++;
        }
        if(s.charAt(0)!=' ') count++;
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(Wordcount(s));
    }
}
